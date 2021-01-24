package condition.test;

import java.util.Scanner;

public class SwitchGradeTest3 {
		
	public static void main(String[] args) {
		//local Variable 메소드 안에 선언된 변수, 기본값이 없다. 값을 할당해야한다.
		//메소드 밖에서는 사용할 수 없다. 사용하면 에러
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하세요 >>");
		String name = sc.nextLine();
		System.out.println("당신의 등급을 입력하세요 >>");
		String grade = sc.nextLine();
		
		switch(grade) {//어떤 행동을 했을 때 반응하는 형태로 많이 쓰인다.
			case "A" :
				System.out.println(name + "님, 당신의 성적은 90~100점입니다.");
				break;
			case "B" :
				System.out.println(name + "님, 당신의 성적은 80~89점입니다.");
				break;
			case "C" :
				System.out.println(name + "님, 당신의 성적은 70~79점입니다.");
				break;
			default :
				System.out.println(name + "님, 당신의 성적은 70점 미만입니다." );
		}	
	}
}
