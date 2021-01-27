package com.encore.test;

import com.encore.child.Manager;
import com.encore.child.Student;
import com.encore.parent.Person;
import com.encore.util.MyDate;

/*
 * PolyMorphism
 * �ϳ��� Ÿ������ ---> Super Type 
 * ���� ���� ��ü�� �����ϴ� ��� ---> Sub Classes Creating
 * 
 */
public class PersonTest1 {

	public static void main(String[] args) {
		//�θ�Ÿ������ �ڽ��� �����.
		Person s1 = new Student("Student1", new MyDate(2000, 2, 2), "NY", "Data A");
		Person s2= new Student("Student2", new MyDate(1999, 3, 2), "NY", "Python");
		Person s3= new Student("Student3", new MyDate(2000, 11, 2), "Texas", "AI");
		Person m1 = new Manager("Manager1", new MyDate(1980, 1, 2), "Texas", "Marketing",500,100);
		
		
		//PolyMorphism���� ��ü�� �����ϸ� �Ʒ� �� ���� ��ȭ�� �ݵ�� �����ؾ� �Ѵ�. -- Object Casting
		
		//1. Manager1�� �μ��� IT �μ��� �����ϰ� �ٽ� ������ Ȯ���ϼ���
		((Manager) m1).setDept("IT");
		System.out.println(m1);
		
		//2. ���� ��ü�� ��� ������ ����ϼ��� -- Virtual Method(�ڽ� �޼ҵ�) Invocation
		/*
		 * ��Ӱ��迡�� �������̵��� �޼ҵ忡���� ��Ÿ���� �����̴�.
		 * Person s = new Student();
		 * 1) Compile ������ Method - �θ��� �޼ҵ带 ȣ�� : toString()
		 * 2) Runtime ������ Method - �ڽ��� �޼ҵ带 ȣ�� : toString()
		 */
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(m1.toString()); //-- Virtual Method Invocation
		
		System.out.println(((Manager) m1).getDept()); // Object Casting
		
	}

}
