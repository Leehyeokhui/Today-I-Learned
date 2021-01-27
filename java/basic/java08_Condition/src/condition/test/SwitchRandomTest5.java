/*
 * package = 디렉토리 = 폴더
 * java.io
 * Top level package.Sub level package --- "." 으로 구분한다.
 * 서로 유사한 기능을 가진 class들의 묶음
 * package 이름은 전부 다 소문자 사용
 * 역할, 기능, 카테고리별로 구분
 */

package condition.test;

public class SwitchRandomTest5 {

	public static void main(String[] args) {
		//dice 1 ~ 6 사이의 정수가 나오도록 코드 수정
		int dice = (int) (Math.random()*6)+1;
		System.out.println(dice);
		
		/*
		 * switch문을 사용해서 각각의 값이 나올 때 dice 1
		 */
		System.out.println("\nswitch문을 이용한 dice print");
		String message = "";
		
		switch(dice) {
		 case 1 :
			message = "dice "+dice;
			 break;
		 case 2 :
			 message = "dice "+dice;
				 break;
		 case 3 :
			 message = "dice "+dice;
				 break;
		 case 4 :
			 message = "dice "+dice;
				 break;
		 case 5 :
			 message = "dice "+dice;
				 break;
		 case 6 :
			 message = "dice 눈 "+dice;
				 break; 
		}
		
		System.out.println(message);
	}

}
