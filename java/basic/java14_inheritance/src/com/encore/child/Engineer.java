package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class Engineer extends Employee {
	private String tech;
	private double bonus;
	public Engineer(String name, MyDate birthDate, double salary, String tech, double bonus) {
		super(name, birthDate, salary);
		this.tech = tech;
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString() + ", " + tech + ", " + bonus;
	}
}
