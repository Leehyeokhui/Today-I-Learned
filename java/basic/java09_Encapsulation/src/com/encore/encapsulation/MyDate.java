package com.encore.encapsulation;
/*
 * 
 *  2021_0104_Workshop�� .java�� �ø���
 * Encapsulation �ۼ��ϴ� ����
 * 1. Field �տ��� private ����
 * 2. setter()/getter() - public ����
 * 3. setter() �޼ҵ� ������ ù���ο���(�ʵ��ʱ�ȭ ����) ����� �޾Ƽ� Ÿ���� ���� �Ҵ�ǵ��� �Ѵ�.
 * 
 * 1. Scanner�� �̿��ؼ� month, day�� �ش��ϴ� ���� �޴´�.
 * 2. month�� �ش��ϴ� ���� 1~12 ������ ���� �ް� �������� ���� �޼����� ���
 * 3. day�� 1,3,5,7,10,12�� 31
 *         4,6,9,11�� 30
 *         2�� 28 ----> if, switch�� �� �� ����ϱ�
 * 4. "�ش��ϴ� ���� �ƴմϴ�"
 * 	  "�ش��ϴ� ��¥�� �ƴմϴ�."
 *    "������ 1�� 4�� �Դϴ�." - ��� ���
 *    "������ 0�� 4�� �Դϴ�." --> X
 *    "������ 1�� 0�� �Դϴ�." --> X
 *         
 */
public class MyDate {
	private int month; //�ʵ� �տ��� "������" private ���̱�!!!!!!
	private int day;
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		//�ʵ��ʱ�ȭ �ϱ� ������ ���ڰ����� �������� Ÿ������ ���θ� �˻��ϰ� Ÿ���� ���� �ʵ忡 �Ҵ�
		if (month >= 1 && month <= 12) {//month�� 1���� 12��� �״�� �ƴϸ� 0�� �Ҵ�, ==�ʵ� �ʱ�ȭ
			this.month = month;
		}else {
			month = 0;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		//�ʵ��ʱ�ȭ �ϱ� ������ ���ڰ����� �������� Ÿ������ ���θ� �˻��ϰ� Ÿ���� ���� �ʵ忡 �Ҵ�
		switch(month) {//month���� ���� day�� �ִ밪�� �޶����Ƿ� switch�� ������ ����
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			if (day >= 1 && day <= 31) {//day�� 1~31�� �ƴϸ� 0�� �Ҵ�
				this.day = day;
			}else {
				day = 0;
			}
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			if (day >= 1 && day <= 30) {//day�� 1~30�� �ƴϸ� 0�� �Ҵ�
				this.day = day;
			}else {
				day = 0;
			}
			break;
		case 2 :
			if (day >= 1 && day <= 28) {//day�� 1~28�� �ƴϸ� 0�� �Ҵ�
				this.day = day;
			}else {
				day = 0;
			}
			break;
		default : //month�� �߸� �Է��� ��� 0�� �Ҵ�
			day = 0;
			//return; �ϸ� ���� ȣ���� �������� �����Ѵ�.
		}
	}
}
//System.exit(0); ��������.. (����)�� ����������
//���� else ������ print�ϴ� �������� �ٽ� �� �� �غ���!!
//1. ���͵� �����ǻ簡 �ִ�/����
//2. (�ɼ�)��� ����̶� ���͵� ����� �ϰ� �ʹ�.
//3. ���� ����Ǵ� ���� ���ַ� / ���� ����(workshop)

