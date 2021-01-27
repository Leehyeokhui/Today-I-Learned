package com.encore.banking;
/*
 * 통장을 개설하는 고객의 정보를 담고 있는 클래스
 * Account 를 Customer 가 Hasing 한다. --> Has a Relation
 * 1. 필드에 가지고자 하는 클래스를 선언
 * 	Account a;
 * 2. 주입 -- setter
 */
public class Customer {
	public String name;
	public int ssn;
	public Account account;
	
	public Customer(String name, int ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public int getSsn() {
		return ssn;
	}

	public Account getAccount() {
		return account;
	}
	
}
