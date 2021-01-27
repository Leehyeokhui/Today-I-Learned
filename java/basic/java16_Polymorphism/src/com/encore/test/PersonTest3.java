package com.encore.test;

import com.encore.child.Manager;
import com.encore.child.Student;
import com.encore.parent.Person;
import com.encore.service.PersonService;
import com.encore.util.MyDate;

public class PersonTest3 {
	
	public static void printPersons(Person[] persons) {
		for(int i = 0; i < persons.length; i++) {
			if(persons[i] != null) System.out.println(persons[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Person s1 = new Student("Student1", new MyDate(2000, 2, 2), "NY", "Data A");
		Person s2= new Student("Student2", new MyDate(1999, 3, 2), "NY", "Python");
		Person s3= new Student("Student3", new MyDate(2000, 11, 2), "Texas", "AI");
		Person m1 = new Manager("Manager1", new MyDate(1980, 1, 2), "Texas", "Marketing",600,100);
		Person m2 = new Manager("Manager2", new MyDate(1981, 1, 2), "Texas2", "Marketing2",400,200);
		Person m3 = new Manager("Manager3", new MyDate(1982, 1, 2), "Texas3", "Marketing3",500,100);
		
		Person [] persons = {s1,s2,s3,m1,m2,m3};
		PersonService service = PersonService.getInstance();
		
		//1~4�������� �޼ҵ带 ���� �̰����� ȣ���ؼ� �ϼ�
		//1.
		System.out.println("��� ��� ����");
		printPersons(service.getAllPerson(persons));
		
		//2.
		System.out.println("�̸����� ��� ã��");
		System.out.println(service.findPersonByBanme(persons, "Student1"));
		
		//3.
		System.out.println("����");
		System.out.println(service.getAnnualSalary(persons, m1));
		
		//4.
		System.out.println("�� �ΰǺ�");
		System.out.println(service.getTotalCost(persons));
		
	}
}
