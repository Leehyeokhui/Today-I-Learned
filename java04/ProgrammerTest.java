package com.encore.self.test;

import com.encore.self.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		// 1. ��ü ����
		Programmer p1 = new Programmer();
		Programmer p2 = new Programmer();
		
		// 2. �� �Ҵ�
		p1.setScoreInfo("������", "�����͸��̴�", 91, 94.3, 'A');
		p2.setScoreInfo("������", "�ΰ�����", 87, 94.3, 'A');
		
		// 3. method ȣ��
		p1.getScoreInfo();
		p2.getScoreInfo();

	}

}
