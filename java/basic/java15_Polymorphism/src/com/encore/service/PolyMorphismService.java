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
		//�����ڸ� ã�Ƽ� �μ��� ��ȹ�η� �ٲٰ� �ʹ�.?
		for(Employee e : earr) {
			if(e instanceof Manager) { //Manager��ü�� True
				if(e.getName().equals("Jamse"))
					((Manager) e).changeDept("��ȹ��");
			}
			/*if(e instanceof Engineer) {
				if(e.getName().equals("Engineer1"))
					((Engineer) e).changeTech("Pytorch");
			}*/
		}
	}
	
	
	
}

//��Ӱ� ����������...
/*
 * JavaDoc...... ��Ŭ����..�ѱ�ó��...�ϸ� euc-kr �ȸ��� | utf-8
 * Object Aid...��Ŭ������ Plugin ���� �ϱ�
 * 
 */
 
