package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<Integer, Account> accMap = new HashMap<Integer, Account>();
	
	public Service(Map map) {
		this.accMap = map;
	}
	
	public Integer generateKey() {
		Integer id = accMap.size()+1;
		return id;
	}
	
	public void addAccount(Account account) {
		if(accMap.size() == 0) {
			accMap.put(1, account);
		} else {
			accMap.put(generateKey(), account);
		}
	}
	
	public void retrieveAccount(Integer key) {
		boolean valid = false;
		
		for(Map.Entry mapEntry:accMap.entrySet()) {
			if(mapEntry.getKey() == key) {
				System.out.println("Key: "+mapEntry.getKey()+", "+mapEntry.getValue());
				valid = true;
			}
		}
		
		if(!valid) {
			System.out.println("Invalid key entered. Please try again");
		}
	}

	public int getCountForFirstName(String firstName) {

		/*int count = 0;
		for(Account eachAccount:accMap.values()) {
			if(eachAccount.getFirstName().equals(firstName)) {
				System.out.println("This is the value of eachAccount firstName "+eachAccount.getFirstName());
				count++;
			}
		}
		return count;*/

		return (int) accMap.values().stream().filter(eachAccount -> eachAccount.getFirstName().equals(firstName)).count();
	}
}
