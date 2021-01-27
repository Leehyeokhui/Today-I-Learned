package com.encore.parent;

import com.encore.util.MyDate;

//Super Class
//vo class 작성
/*
 * 필드 선언
 * 생성자
 * setter() / getter()
 * toString() 오버라이딩
 */
public class Person {
	private String name;
	private MyDate birthDate;
	private String address;
	
	public Person(String name, MyDate birthDate, String address) {
		super();//object 필드 초기화 하기 직전에 먼저 부모를 생성해야만 한다.
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
