package com.encore.banking;

//통장에 대한 정보
public class Account {
	public double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	//일정량의 금액을 입금하는 기능
	public void deposit(double amount) { //업데이트니까 balance = 꼭 넣어야함
		balance += amount; // +=의 성능이 balance + amount 보다 좋다. 이거 익숙해지자.
	}
	
	//일정량의 금액을 출금하는 기능
	public void widthdraw(double amount) {
		balance -= amount;
	}
}
