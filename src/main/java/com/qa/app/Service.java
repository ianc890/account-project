package com.qa.app;

import java.util.HashMap;
import java.util.Map;

public class Service {
	
	private Map<Integer, Account> accMap = new HashMap<Integer, Account>();
	
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

}
