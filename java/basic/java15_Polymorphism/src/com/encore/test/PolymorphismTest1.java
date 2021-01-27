package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.parent.Employee;
import com.encore.util.MyDate;
/*
 * 부모타입으로 자식 객체를 생성하면 발생하는 문제점
 * Object Casting으로 해결한다.
 */
public class PolymorphismTest1 {

	public static void main(String[] args) {
		Employee e = new Employee("Employee", new MyDate(1999, 1, 1), 20000.0);
		Employee m = new Manager("James", new MyDate(1990, 2, 1), 200000.0, "개발부");
		Employee eg = new Engineer("Engineer", new MyDate(1985, 3, 1), 300000.0, "java", 100.0);
		
		//James의 부서를 개발부에서 교육부로 변경... Employee에서 찾지말고 Manager에서 찾도록 불러줘야한다.
		//---> Object Casting
		
		/*Manager m1 = (Manager)m;
		m1.changeDept("교육부");*/
		
		((Manager) m).changeDept("교육부");
		
		
		System.out.println(e.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		
		
		
	}
}
