package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Secretary extends Employee {
	private String bossOfName;

	public Secretary(String name, MyDate birthDate, double salary, String bossOfName) {
		super(name, birthDate, salary);
		this.bossOfName = bossOfName;
	}
	
	public String toString() {
		return super.toString() + ", " + bossOfName;
	}
	
}
