package com.encore.service;

import com.encore.child.Manager;
import com.encore.parent.Person;
/*
 * �� Ŭ������ �̱������� �����ϰ�
 * ~Test Ŭ�������� ��ü ���� ��ſ� ������ ��ü�� �޾ƿͼ� ����ϴ� �ڵ�� ����
 */
public class PersonService {
	private static PersonService service = new PersonService(); // ������ �����
	private PersonService() {}
	public static PersonService getInstance() {
		return service;
	}
	
	//1. ��� ���� ����ϴ� ���
	public static Person[] getAllPerson(Person[] parr) {
		Person[] all = new Person[parr.length];
		int idx = 0;
		for(Person p : parr) all[idx++] = p;
		return all;
	}
	
	//2. �̸����� ��� �˻��ϱ�(�̸��� �ߺ���� �ȵȴ�.)
	public static Person findPersonByBanme(Person[] parr, String name) {
		Person person = null;
		for(Person p : parr) {
			if(p == null) continue;
			if(p.getName().equals(name)) person = p;
		}
		return person;
	}
	
	//3. Ư���� ����� ������ ��ȯ
	public static int getAnnualSalary(Person[] parr, Person p) {
		int annualsalary = 0;
		for(Person per : parr) {
		if(per instanceof Manager)
			annualsalary = ((Manager) per).getSalary()*12 + ((Manager) per).getBonus();
		}
		return annualsalary;
	}
	
	//4. �� �ΰǺ�
	public static int getTotalCost(Person[] parr) {
		int total = 0;
		for(Person p : parr) {
			if(p instanceof Manager) total += getAnnualSalary(parr, p) ;	
		}
		return total;
	}
}
