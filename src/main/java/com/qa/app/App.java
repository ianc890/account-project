package com.qa.app;

public class App {

	public static void main(String[] args) {
		Account accountOne = new Account("John", "Doe", "C001");
		Account accountTwo = new Account("Jane", "Doe", "C002");
		Account accountThree = new Account("Mary", "Murphy", "C003");
		
		Service service = new Service();
		service.addAccount(accountOne);
		service.addAccount(accountTwo);
		service.addAccount(accountThree);
		
		service.retrieveAccount(4);
		service.retrieveAccount(1);
		service.retrieveAccount(2);
		service.retrieveAccount(3);
		
	}
}
