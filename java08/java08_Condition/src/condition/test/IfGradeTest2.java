package condition.test;

//java.lang 이 아닌 다른 패키지에 있는 클래스를 사용할 때는 반드시 import 해서 사용해야 한다.
import java.util.Scanner;

/*
 * step2
 * 실행 시 값을 받아서 처리하도록 로직을 작성
 * Scanner 객체를 생성
 */
public class IfGradeTest2 {

	public static void main(String[] args) {
		//int grade = 87;
		//키보드로 입력한 값을 받는 Scanner 객체를 생성
		Scanner sc = new Scanner(System.in); 
		System.out.println("당신의 이름을 입력하세요 >>");
		// Scanner 클래스의 기능.. next(), nextLine(), nextInt()
		String name = sc.nextLine();
		System.out.println("당신의 성적을 입력하세요 >>");
		int grade = sc.nextInt();
		
		if(grade >= 90 && grade <= 100) {
			System.out.println(name + "님, A Grade!");
		}else if(grade >= 80 && grade < 90) {
			System.out.println(name + "님, B Grade!");
		}else if(grade >= 70 && grade< 80) {
			System.out.println(name + "님, C Grade!");
		}else {
			System.out.println(name + "님, Try Again!");
		}		
	}
}

