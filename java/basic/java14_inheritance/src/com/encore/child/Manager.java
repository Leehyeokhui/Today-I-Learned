package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Manager extends Employee{
	private String dept;

	public Manager(String name, MyDate birthDate, double salary, String dept) {
		super(name, birthDate, salary);//super�� �θ� �ǹ��ϴ� Ű����
		this.dept = dept;
	}
	
	//getDetails()�� ����� �� ������ �θ��� ����� ����ϰ� �ȴ�.
	//�޼ҵ带 �����޵� ����� �ڽſ��� �´� ������ �ٽ� ���Ľ�� �Ѵ�.
	//Method overriding
	/*
	 * �ݵ�� ��� ���迡 �ִ� 2���� Ŭ�������� �߻��ϴ� �����̴�.
	 * 1) �θ� ���� ���� �״�� �����޴´�.
	 * 2) �װ� �ٽ� ��ģ��.
	 * 
	 * <Syntax>
	 * ����δ� ������ �����ΰ� �޶������� �޼ҵ��� ����� �ٽ� ������ �� ����Ѵ�.
	 * 1. �޼ҵ� ����δ� ��� ��ġ�Ѵ�.
	 * 2. �޼ҵ��� �����δ� �ݵ�� �޶�����.
	 * --> �޼ҵ��� �ϴ� ���� �޶�����. -> ���ο� �޼ҵ尡 �ٽ� ��������ٴ� �ǹ̷� �޼ҵ� ������
	 */
	/*public String getDetails() {
		return super.getDetails() + ", " + dept;
	}*/
	
	public String toString() {
		return super.toString() + ", " + dept;
	}
}
