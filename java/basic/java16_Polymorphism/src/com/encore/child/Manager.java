package com.encore.child;

import com.encore.parent.Person;
import com.encore.util.MyDate;

public class Manager extends Person{
	private String dept;
	private int salary;
	private int bonus;

	public Manager(String name, MyDate birthDate, String address, String dept, int salary, int bonus) {
		super(name, birthDate, address);//Person
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + dept;
	}
	
}
