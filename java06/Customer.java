package com.encore.banking;
/*
 * ������ �����ϴ� ���� ������ ��� �ִ� Ŭ����
 * Account �� Customer �� Hasing �Ѵ�. --> Has a Relation
 * 1. �ʵ忡 �������� �ϴ� Ŭ������ ����
 * 	Account a;
 * 2. ���� -- setter
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
