package com.encore.service;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;

public class PolyMorphismService {
	//1. step1
	/*public void handleManager(Manager m) {	}
	public void handleEngineer(Engineer eg) {	}
	public void handleSecretary(Secretary s) {	}*/
	
	//2. step2
	//public void handleEmployee(Employee e) {	}
	
	//3. step3
	public void handleEmployee(Employee[] earr) {
		//관리자만 찾아서 부서를 기획부로 바꾸고 싶다.?
		for(Employee e : earr) {
			if(e instanceof Manager) { //Manager객체만 True
				if(e.getName().equals("Jamse"))
					((Manager) e).changeDept("기획부");
			}
			/*if(e instanceof Engineer) {
				if(e.getName().equals("Engineer1"))
					((Engineer) e).changeTech("Pytorch");
			}*/
		}
	}
	
	
	
}

//상속과 폴리몰피즘...
/*
 * JavaDoc...... 이클립스..한글처리...하면 euc-kr 안먹음 | utf-8
 * Object Aid...이클립스에 Plugin 직접 하기
 * 
 */
 
