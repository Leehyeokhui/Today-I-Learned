package com.encore.banking;

//���忡 ���� ����
public class Account {
	public double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	
	//�������� �ݾ��� �Ա��ϴ� ���
	public void deposit(double amount) { //������Ʈ�ϱ� balance = �� �־����
		balance += amount; // +=�� ������ balance + amount ���� ����. �̰� �ͼ�������.
	}
	
	//�������� �ݾ��� ����ϴ� ���
	public void widthdraw(double amount) {
		balance -= amount;
	}
}
