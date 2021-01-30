package exceptTest;

class MyNumException extends Exception{
	public MyNumException(String msg) {
		super(msg);
	}
}

class MyNum{
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) throws MyNumException{
		if (num < 1 || num > 5) {
			throw new MyNumException("num 값은 1~5만 가능"); //예외 발생
		}
		this.num = num;
	}
	
}

public class Except3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNum mn = new MyNum();
		try {
			mn.setNum(3);
			System.out.println(mn.getNum());
			mn.setNum(8);
			System.out.println(mn.getNum());
		} catch (MyNumException e) {
			// 예외 발생 시 출력할 수 있는 메시지 3가지
			System.out.print("1. stack trace : ");
			e.printStackTrace(); //예외를 스택을 추적하면서 출력
			System.out.println("2.e : " + e); //toString() 반환값 출력. 예외 클래스는 등록된 예외 메시지 반환하도록 재정의 되어있다.
			System.out.println("3.getMessage : " + e.getMessage()); //예외 클래스에 등록된 예외 메시지 반환
		}
		System.out.println("프로그램 끝까지 실행됨");
		
		
	}
}
