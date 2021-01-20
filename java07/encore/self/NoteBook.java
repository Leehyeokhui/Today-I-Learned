package com.encore.self;

import java.text.NumberFormat;

//노트북 정보

public class NoteBook {
	//필드 생성
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
		return "모델 정보 : " + model + "-" + serialNumber + ", 가격 정보 : " + NumberFormat.getInstance().format(price) +"원, 제조일자 : "+ madeDate.getMyDate();
	}
}