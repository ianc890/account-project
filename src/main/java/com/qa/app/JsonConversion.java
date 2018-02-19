package com.qa.app;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonConversion {
	
	private ObjectMapper mapper = new ObjectMapper();
	
	public void printJson(Map<Integer, Account> map) {
		String jsonStr;
		try {
			jsonStr = mapper.writeValueAsString(map);
	        System.out.println(jsonStr);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void printJson(Account account) {
		String jsonStr;
		try {
			jsonStr = mapper.writeValueAsString(account);
	        System.out.println(jsonStr);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
