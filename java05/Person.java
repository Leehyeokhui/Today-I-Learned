package com.encore.oop;
/*
 * Constructor?
 * ��ü�� ������ ������ �����ϴ� ��
 * 1. �⺻������ Person(){}
 * 	���ڰ��� ���� �����ο��� �ƹ��ϵ� ���� �ʴ� ������... Nothing Working
 * 	�������� A.M�� Ŭ������ ���󰣴�.
 * 	�����ڰ� �ٸ� ������(?)�� �־����� ������ �����Ϸ��� �⺻�����ڸ� ��� �ְ� �ڵ带 ������.
 * 	�ϳ��� Ŭ�������� �ݵ�� �ϳ� �̻��� �����ڰ� �����Ѵ�.
 * 	
 * 2. ����� ������
 * 	���ڰ��� �ϳ� �̻��� ������.
 * 	�ʵ� �ʱ�ȭ
 * 	������ �����ڰ� �ϳ��� ������ �����Ϸ��� �⺻�����ڸ� �־����� �ʴ´�.
 * 
 * Ŭ���� ����� �ۼ��� ��
 * 1. �ʵ带 �� �����ؼ� �����Ѵ�.
 * 2. ���� �����Ѵ�.
 * 	���� ���ԵǴ� ���
 * 	- setter
 * 	- constructor
 * 3. ���Ե� ���� �޾ƿ´�.
 * 
 */
public class Person {

	public String name;
	public int age;
	public String address;
	
	public Person(){}
	public Person(String name, int age, String address) {//Passing Into.. ���ڰ��� ����, Ÿ��, ����
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void getPersonInfo() {
		System.out.println(name+","+age+","+address);
	}
	
	public void setPersonInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
}
