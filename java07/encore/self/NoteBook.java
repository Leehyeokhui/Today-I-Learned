package com.encore.self;

import java.text.NumberFormat;

//��Ʈ�� ����

public class NoteBook {
	//�ʵ� ����
	public int serialNumber;
	public String model;
	public MyDate madeDate;
	public float price;
	
	public NoteBook(int serialNumber, String model, MyDate madeDate, float price) {
		this.serialNumber = serialNumber;
		this.model = model;
		this.madeDate = madeDate;
		this.price = price;
	}

	public String getNoteBookInfo() {
		return "�� ���� : " + model + "-" + serialNumber + ", ���� ���� : " + NumberFormat.getInstance().format(price) +"��, �������� : "+ madeDate.getMyDate();
	}
}