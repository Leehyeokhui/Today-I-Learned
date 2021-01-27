package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.parent.Employee;
import com.encore.util.MyDate;
/*
 * �θ�Ÿ������ �ڽ� ��ü�� �����ϸ� �߻��ϴ� ������
 * Object Casting���� �ذ��Ѵ�.
 */
public class PolymorphismTest1 {

	public static void main(String[] args) {
		Employee e = new Employee("Employee", new MyDate(1999, 1, 1), 20000.0);
		Employee m = new Manager("James", new MyDate(1990, 2, 1), 200000.0, "���ߺ�");
		Employee eg = new Engineer("Engineer", new MyDate(1985, 3, 1), 300000.0, "java", 100.0);
		
		//James�� �μ��� ���ߺο��� �����η� ����... Employee���� ã������ Manager���� ã���� �ҷ�����Ѵ�.
		//---> Object Casting
		
		/*Manager m1 = (Manager)m;
		m1.changeDept("������");*/
		
		((Manager) m).changeDept("������");
		
		
		System.out.println(e.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		
		
		
	}
}
