package condition.test;

import java.util.Scanner;

public class SwitchGradeTest4 {
		
	public static void main(String[] args) {// 실행할 때 main 메소드부터 시작
		//local Variable 메소드 안에 선언된 변수, 기본값이 없다. 값을 할당해야한다.
		//메소드 밖에서는 사용할 수 없다. 사용하면 에러
		Scanner sc = new Scanner(System.in); //Scanner 객체의 구성요소(필드,메소드)가 메모리에 올라간다.
		
		System.out.println("당신의 이름을 입력하세요 >>");
		String name = sc.nextLine();
		System.out.println("당신의 등급을 입력하세요 >>");
		String grade = sc.nextLine();
		
		//추가.. 메소드 안에서 선언되었기 때문에 local Variable
		String message = "";//반드시 local Variable 선언 시에는 초기값을 줘야 한다. ""라도 줘야 한다.
		
		switch(grade) {//어떤 행동을 했을 때 반응하는 형태로 많이 쓰인다.
			case "A" :
				message = name + "님, 당신의 성적은 90~100점입니다." ;
				break; //해당 case를 빠져 나온다. -> switch문에서 빠져 나온다.
			case "B" :
				message = name + "님, 당신의 성적은 80~89점입니다." ;
				break;
			case "C" :
				message = name + "님, 당신의 성적은 70~79점입니다." ;
				break;
			default :
				message = name + "님, 당신의 성적은 70점 미만입니다." ;
		}	
		
		System.out.println(message);
	}
}
