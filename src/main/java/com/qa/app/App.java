package com.qa.app;

import java.util.HashMap;
import java.util.Map;

import com.qa.convert.JsonConversion;
import com.qa.domain.Account;
import com.qa.service.Service;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, Account> map = new HashMap<Integer, Account>();
		
		Account accountOne = new Account("John", "Doe", "C001");
		Account accountTwo = new Account("Jane", "Doe", "C002");
		Account accountThree = new Account("Mary", "Murphy", "C003");
		
		Service service = new Service(map);
		service.addAccount(accountOne);
		service.addAccount(accountTwo);
		service.addAccount(accountThree);
		
		service.retrieveAccount(4);
		service.retrieveAccount(1);
		service.retrieveAccount(2);
		service.retrieveAccount(3);
		
		JsonConversion convert = new JsonConversion();
		convert.printJson(map);
		convert.printJson(accountOne);

		System.out.println(service.getCountForFirstName("John"));
	}
}
