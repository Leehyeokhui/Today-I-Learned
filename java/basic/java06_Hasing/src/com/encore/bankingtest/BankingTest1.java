package com.encore.bankingtest;

import com.encore.banking.Customer;
import com.encore.banking.Account;

public class BankingTest1 {

	public static void main(String[] args) {
		//1. ��ü ����
		Customer c1 = new Customer("james", 123);		
		
		//2. james��� ���� �ܾ��� 1������ ������ ����
		c1.setAccount(new Account(10000)); // ������ ���ÿ� ������ �� �ִ�!!!
		
		//3. james �� ������ ������ �޾ƿͼ�
		Account jamesAcc = c1.getAccount(); // �޾ƿ� ���¸� ���ο� ������ ���� ����
		
		//4. 7õ���� �Ա�, 2000���� �Ա�, 5000���� ���
		jamesAcc.deposit(7000);
		jamesAcc.deposit(2000);
		jamesAcc.widthdraw(5000);
		
		//5. �������� �ܾ��� Ȯ��... 14000���� �´����� ���
		System.out.println("�����ݾ� : "+jamesAcc.getBalance()+"��");
	}
}
