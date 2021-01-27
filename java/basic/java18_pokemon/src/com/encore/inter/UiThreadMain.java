package com.encore.inter;

import java.awt.Frame;
//Runnable : Thread 대응 인터페이스, thread를 만들기 위해 상속받는 인터페이스(다중상속에서 사용, 단일 상속이라면 extends Thread를 사용)
class Test extends Frame implements Runnable{//implements 다음엔 인터페이스가 온다(인터페이스를 상속받는 키워드)
//Frame 이면서 쓰레드임
	@Override
	public void run() {
		for(int i =0; i < 10; i++) {
			this.setTitle("쓰레드 출력 : " + i); //Frame의 메소드
			try {
				Thread.sleep(1000);//1000이 1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

public class UiThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.setSize(500, 200);//Frame 윈도우 창 가로세로 크기
		t.setVisible(true); //화면에 보이게 할 것인가
		Thread th = new Thread(t);
		th.start();
	}
}
