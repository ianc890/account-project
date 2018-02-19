package com.qa.domain;

public class Account {
	
	private String firstName;
	private String lastName;
	private String accountNo;
	
	public Account(String fName, String lName, String accNo) {
		this.firstName = fName;
		this.lastName = lName;
		this.accountNo = accNo;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNo=" + accountNo + "]";
	}
}
