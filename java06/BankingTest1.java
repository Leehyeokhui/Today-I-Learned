package com.encore.bankingtest;

import com.encore.banking.Customer;
import com.encore.banking.Account;

public class BankingTest1 {

	public static void main(String[] args) {
		//1. 객체 생성
		Customer c1 = new Customer("james", 123);		
		
		//2. james라는 고객이 잔액이 1뭔원인 통장을 개설
		c1.setAccount(new Account(10000)); // 생성과 동시에 주입할 수 있다!!!
		
		//3. james 가 개설한 통장을 받아와서
		Account jamesAcc = c1.getAccount(); // 받아온 계좌를 새로운 변수로 만들어서 주입
		
		//4. 7천원을 입금, 2000원을 입금, 5000원을 출금
		jamesAcc.deposit(7000);
		jamesAcc.deposit(2000);
		jamesAcc.widthdraw(5000);
		
		//5. 최종적인 잔액을 확인... 14000원이 맞는지를 출력
		System.out.println("최종금액 : "+jamesAcc.getBalance()+"원");
	}
}
