package com.encore.self.test;

import com.encore.self.Programmer;
import com.encore.self.NoteBook;

import java.text.NumberFormat;

import com.encore.self.MyDate;

public class ProgrammerTest1 {

	public static void main(String[] args) {
		Programmer hong = new Programmer("홍길동", "Java", 3000000, 11000000);
		
		NoteBook noteBook = new NoteBook(1254, "MAC", new MyDate(2020,12,11),2250000f);
		
		hong.setNoteBook(noteBook);
		
		NoteBook hongNoteBook = hong.getNoteBook();
		
		System.out.println("Mr hong의 정보입니다.");
		hong.printProgrammerInfor();
		System.out.println("\nMr hong의 연봉 정보입니다.");
		System.out.println(NumberFormat.getInstance().format(hong.getAnnualSalary())+"원");
		System.out.println("\nMr Hong이 구매한 노트북 정보입니다.");
		System.out.println(hongNoteBook.getNoteBookInfo());
	}
}