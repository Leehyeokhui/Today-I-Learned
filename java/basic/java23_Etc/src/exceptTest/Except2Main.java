package exceptTest;

import java.io.IOException;

class Test{
	public void input() throws IOException { //이 메소드가 IOException 예외처리를 호출하는 쪽으로 미룸
		char ch = ' ';
		while((ch = (char) System.in.read()) != '\n') { //자바는 입출력 코드에 예외처리를 강제 요구
			System.out.print(ch);
		}
	}
	
	//호출하는 쪽에 예외처리를 강제로 요구할 때 사용
	public void printArr(int[] arr) throws ArrayIndexOutOfBoundsException{
		for(int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}

public class Except2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		
		int[] a = {1,2,3};
		try {
			t.printArr(a);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			t.input();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
