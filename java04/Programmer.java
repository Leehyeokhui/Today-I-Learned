package com.encore.self;

public class Programmer {
	//�ʵ� ����  
	public String name; // �л� �̸�
	public String subject; // ���� �̸�
	public int middlescore; // �߰���� ����(�Ҽ��� ����)
	public double finalscore; // �⸻��� ����(�Ҽ��� ����)
	public char score; // ����, + ����
	
	//method ����
	public void setScoreInfo(String name, String subject, int middlescore, double finalscore, char score) { // assign value method
		this.name = name;
		this.subject = subject;
		this.middlescore = middlescore;
		this.finalscore = finalscore;
		this.score = score;
	}
	
	public double scoreAverage() { // �������� == �߰����� �⸻��� ������ ���
		return (middlescore + finalscore)/2;
	}
	
	public void getScoreInfo() {
		System.out.println(name+" �л��� "+subject+" ������ ���������� "+scoreAverage()+"�̰� ���� ������ "+ score+"�Դϴ�." );
	}
}
