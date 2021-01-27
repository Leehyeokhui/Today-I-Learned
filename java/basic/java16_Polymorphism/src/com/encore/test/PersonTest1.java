package com.encore.test;

import com.encore.child.Manager;
import com.encore.child.Student;
import com.encore.parent.Person;
import com.encore.util.MyDate;

/*
 * PolyMorphism
 * 하나의 타입으로 ---> Super Type 
 * 여러 개의 객체를 생성하는 기법 ---> Sub Classes Creating
 * 
 */
public class PersonTest1 {

	public static void main(String[] args) {
		//부모타입으로 자식을 만든다.
		Person s1 = new Student("Student1", new MyDate(2000, 2, 2), "NY", "Data A");
		Person s2= new Student("Student2", new MyDate(1999, 3, 2), "NY", "Python");
		Person s3= new Student("Student3", new MyDate(2000, 11, 2), "Texas", "AI");
		Person m1 = new Manager("Manager1", new MyDate(1980, 1, 2), "Texas", "Marketing",500,100);
		
		
		//PolyMorphism으로 객체를 생성하면 아래 두 가지 변화를 반드시 이해해야 한다. -- Object Casting
		
		//1. Manager1의 부서를 IT 부서로 변경하고 다시 정보를 확인하세요
		((Manager) m1).setDept("IT");
		System.out.println(m1);
		
		//2. 각각 객체의 모든 정보를 출력하세요 -- Virtual Method(자식 메소드) Invocation
		/*
		 * 상속관계에서 오버라이딩된 메소드에서만 나타나는 원리이다.
		 * Person s = new Student();
		 * 1) Compile 시점의 Method - 부모의 메소드를 호출 : toString()
		 * 2) Runtime 시점의 Method - 자식의 메소드를 호출 : toString()
		 */
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(m1.toString()); //-- Virtual Method Invocation
		
		System.out.println(((Manager) m1).getDept()); // Object Casting
		
	}

}
