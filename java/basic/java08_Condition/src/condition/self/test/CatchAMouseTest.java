package condition.self.test;
/*
 * package
 * static
 * Scanner
 * abs()
 * if
 */

import java.util.Scanner;

public class CatchAMouseTest {
		public static String solv(int x, int y, int z) {
			if(Math.abs(x-z) > Math.abs(y-z)) return "CatB Catch a Mouse!!";
			else if(Math.abs(x-z) < Math.abs(y-z)) return "CatA Catch a Mouse!!";
			else return "Mouse Escapes!!";
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int catA = sc.nextInt(); //catA 자리 입력
		int catB = sc.nextInt(); //catB 자리 입력
		int Mouse = sc.nextInt(); //Mouse 자리 입력
		
		String result = CatchAMouseTest.solv(catA, catB, Mouse);
		System.out.println("Result : "+result);	
	}
}
