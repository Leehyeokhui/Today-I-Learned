package com.encore.oop.test;

import com.encore.oop.Person;

public class PersonTest {

	public static void main(String[] args) {//main�� calling method
		Person p = new Person(); //����Ʈ(���ڰ��� ����.), �⺻ ������ ȣ��.. ����Ʈ���� null, 0, null���� ����� ����
		Person p2 = new Person("ȣȣ",22,"��赿"); //����� ������..���ڰ��� �ִ�.
		
		p.setPersonInfo("����", 33, "�Ŵ絿"); //���ο� ���� ����
		
		p.getPersonInfo();
		p2.getPersonInfo();
	}

}
