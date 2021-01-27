package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.parent.Employee;
import com.encore.service.PolyMorphismService;
import com.encore.util.MyDate;
/*
 * 부모타입으로 자식 객체를 생성하면 발생하는 문제점
 * Object Casting으로 해결한다.
 */
public class PolymorphismTest2 {

	public static void main(String[] args) {
		Employee e = new Employee("Employee", new MyDate(1999, 1, 1), 20000.0);
		Employee m = new Manager("James", new MyDate(1990, 2, 1), 200000.0, "개발부");
		Employee eg = new Engineer("Engineer", new MyDate(1985, 3, 1), 300000.0, "java", 100.0);
		Employee m1 = new Manager("James1", new MyDate(1990, 5, 1), 500000.0, "총무부");
		Employee eg1 = new Engineer("Engineer1", new MyDate(1985, 3, 1), 700000.0, "Python", 100.0);
		
		//Heterogeneous Collection... Same Data Type - X
		Employee [] emps = {e,m,eg,m1,eg1};
		
		PolyMorphismService service = new PolyMorphismService();
		service.handleEmployee(emps);
		
		
	}
}
