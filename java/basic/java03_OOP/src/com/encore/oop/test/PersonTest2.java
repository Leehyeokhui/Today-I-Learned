/*
 * PersonTest Ŭ������ Person Ŭ������ �����ϴ� ����Ŭ����
 * �����ϱ� ���ؼ��� Person�� �޸𸮿� �÷����Ѵ�. == ��ü����
 * ������ ����� �ʵ�� �޼ҵ��̴�.
 * 1) �ʵ� ---> ���� �Ҵ�
 * 2) �޼ҵ� ---> �޼ҵ带 ȣ��
 */

package com.encore.oop.test;

import com.encore.oop.Person;

/*
 * step1.
 * �ش� �ڵ��� ������
 * ��ü�� ������ ������ ������ �ʵ忡 ���� ���� �Ҵ��ϰ� �Ǹ� �ڵ������ �ʹ� ��������.
 * 
 * �ذ�å
 * ������ �ʵ忡 ���� �Ҵ��ϴ� �޼ҵ带 �ϳ� �����ϰ� �� �޼ҵ带 ����ؼ� ���� �Ҵ��Ѵ�.
 */
public class PersonTest2 {

	public static void main(String[] args) {
		//1. ��ü����
		Person p1 = new Person();
		Person p2 = new Person();
		
		//2. �� �Ҵ�
		p1.setPersonInfo("��ȣ��", 44, "�Ż絿");
		p2.setPersonInfo("�̼���", 40, "���ǵ�");
		
		//3. �޼ҵ� ȣ��
		p1.getPersonInfo();
		p2.getPersonInfo();
	}
}
