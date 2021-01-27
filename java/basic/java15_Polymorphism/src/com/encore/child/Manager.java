package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Manager extends Employee{
	private String dept;

	public Manager(String name, MyDate birthDate, double salary, String dept) {
		super(name, birthDate, salary);//super�� �θ� �ǹ��ϴ� Ű����
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	public String getDetails() {
		return super.getDetails() + ", " + dept;
	}
	
}
