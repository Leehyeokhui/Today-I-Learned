package com.encore.service;

import com.encore.child.Manager;
import com.encore.parent.Person;
/*
 * 이 클래스를 싱글톤으로 변경하고
 * ~Test 클래스에서 객체 생성 대신에 생성한 객체를 받아와서 사용하는 코드로 수정
 */
public class PersonService {
	private static PersonService service = new PersonService(); // 생성자 만들기
	private PersonService() {}
	public static PersonService getInstance() {
		return service;
	}
	
	//1. 모든 정보 출력하는 기능
	public static Person[] getAllPerson(Person[] parr) {
		Person[] all = new Person[parr.length];
		int idx = 0;
		for(Person p : parr) all[idx++] = p;
		return all;
	}
	
	//2. 이름으로 사람 검색하기(이름은 중복허용 안된다.)
	public static Person findPersonByBanme(Person[] parr, String name) {
		Person person = null;
		for(Person p : parr) {
			if(p == null) continue;
			if(p.getName().equals(name)) person = p;
		}
		return person;
	}
	
	//3. 특정한 사람의 연봉을 반환
	public static int getAnnualSalary(Person[] parr, Person p) {
		int annualsalary = 0;
		for(Person per : parr) {
		if(per instanceof Manager)
			annualsalary = ((Manager) per).getSalary()*12 + ((Manager) per).getBonus();
		}
		return annualsalary;
	}
	
	//4. 총 인건비
	public static int getTotalCost(Person[] parr) {
		int total = 0;
		for(Person p : parr) {
			if(p instanceof Manager) total += getAnnualSalary(parr, p) ;	
		}
		return total;
	}
}
