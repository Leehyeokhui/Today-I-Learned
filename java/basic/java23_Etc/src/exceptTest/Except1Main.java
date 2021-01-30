package exceptTest;

public class Except1Main {
	public int test;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("예외 발생 전");
		int x;
		int[] arr = {1,2,3};
		Except1Main em = null;
		try {
			System.out.println("try 블록 1");
			//x = 3 / 0;
			//arr[3] = 4;
			em.test = 10;
			System.out.println("try 블록 2"); //실행 안됨. 위에서 예외 발생 시 catch블록으로 분기
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("예외 발생 : " + e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : " + e);
		}catch(Exception e) { //위에 나열한 예외 객체가 아니면 여기서 걸러줌
			System.out.println("예외 발생 : " + e);
		}finally { //필수는 아니므로 필요 시 작성
			System.out.println("꼭 실행해야 하는 코드");
		}
		
		System.out.println("예외 발생 후");
		
		
	}

}
