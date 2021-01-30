package exceptTest;

class Test2 {
	public void test1() {
		test2();
	}

	public void test2() {
		test3();
	}

	public void test3() {
		int x = 3/0;
	}

}

public class Except4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		try {
		t.test1();
		} catch(ArithmeticException e)  {
			System.out.println(e);
		}
		
		
	}

}
