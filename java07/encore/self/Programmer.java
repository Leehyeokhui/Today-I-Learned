package com.encore.self;

import java.text.NumberFormat;

public class Programmer {
	public String name;
	public String tech;
	public int salary;
	public int bonus;
	public NoteBook noteBook;
	
	public Programmer(String name, String tech, int salary, int bonus) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public void printProgrammerInfor( ) {
		System.out.println("���� : " + name + ", ������α׷� : " + tech + ", �޿� : " + NumberFormat.getInstance().format(salary) + ", �󿩱� : " + NumberFormat.getInstance().format(bonus));
	}
	
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}	
	
	public NoteBook getNoteBook() {
		return noteBook;
	}

	public int getAnnualSalary() {
		return salary * 12 + bonus;
	}
}
