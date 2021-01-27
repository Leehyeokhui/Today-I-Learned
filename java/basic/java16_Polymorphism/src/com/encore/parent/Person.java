package com.encore.parent;

import com.encore.util.MyDate;

//Super Class
//vo class �ۼ�
/*
 * �ʵ� ����
 * ������
 * setter() / getter()
 * toString() �������̵�
 */
public class Person {
	private String name;
	private MyDate birthDate;
	private String address;
	
	public Person(String name, MyDate birthDate, String address) {
		super();//object �ʵ� �ʱ�ȭ �ϱ� ������ ���� �θ� �����ؾ߸� �Ѵ�.
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + ", " + birthDate + ", " + address;
	}
	
	
}
