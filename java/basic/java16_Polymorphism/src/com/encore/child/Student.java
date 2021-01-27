package com.encore.child;

import com.encore.parent.Person;
import com.encore.util.MyDate;

public class Student extends Person{
	private String course;

	public Student(String name, MyDate birthDate, String address, String course) {
		super(name, birthDate, address);
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + course;
	}
	
}
