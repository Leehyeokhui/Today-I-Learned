package com.encore.test;

import com.encore.child.Manager;
import com.encore.child.Student;
import com.encore.parent.Person;
import com.encore.util.MyDate;


public class PersonTest2 {

	public static void main(String[] args) {
		Student s11 = new Student("Student1", new MyDate(2000, 2, 2), "NY", "Data A");
		Student s22= new Student("Student2", new MyDate(1999, 3, 2), "NY", "Python");
		Student s33= new Student("Student3", new MyDate(2000, 11, 2), "Texas", "AI");
		Manager m11 = new Manager("Manager1", new MyDate(1980, 1, 2), "Texas", "Marketing",500,100);
		
		Student[] sarr = {s11,s22,s33}; // Same Data Type... Homogeneous Collection
		//Encore Academy 입장에서는 상당히 관리하기 불편한 코드가 나올 수 밖에 없다.
		
		////////////////////////////////////////////////////////////////////////////
		//상속 --- PolyMolphism
		Person s1 = new Student("Student1", new MyDate(2000, 2, 2), "NY", "Data A");
		Person s2= new Student("Student2", new MyDate(1999, 3, 2), "NY", "Python");
		Person s3= new Student("Student3", new MyDate(2000, 11, 2), "Texas", "AI");
		Person m1 = new Manager("Manager1", new MyDate(1980, 1, 2), "Texas", "Marketing",500,100);
		
		Person [] parr = {s1,s2,s3,m1}; //Heterogeneous Collection
		//Encore Academy 입장에서 관리하기 효율적인 코드가 나온다.
		
		for(Person p : parr) System.out.println(p);
		
		
		
		
		
	}

}
