/*
 * 제어문이란?
 * 주어진 조건이 참일때만 해당 코드블록을 실행하는 문장
 * 조건을 주어서 문장의 흐름을 제어함으로써 좀 더 정교한 프로그램을 할 수 있도록 해준다.
 * ::
 * <<Syntax>>
 * if(boolean_expression){
 *   //code block;
 * }else if(boolean_expression2){
 * 	 //code block;
 * }else{
 * 	 //code block;
 * }
 * state가 한 줄 일때에는 {} 생략가능
 * 
 * 논리연산자
 * &(and)	|(or)
 * &&		||		-- Short Circuit 
 * ---> 결과는 동일한 결과가 도출된다.
 * 뒷부분 연산을 수행을 하지 않음으로써 뒷부분에서 발생할 수 있는 예외를 건너뛸 수 있다.
 */

package condition.test;

public class IfGradeTest1 {

	public static void main(String[] args) {
		int grade = 87;
		
		if(grade >= 90 && grade <= 100) {
			System.out.println("A Grade");
		}else if(grade >= 80 && grade < 90) {
			System.out.println("B Grade");
		}else if(grade >= 70 && grade< 80) {
			System.out.println("C Grade");
		}else {
			System.out.println("Try Again");
		}		
	}
}

/*
 * 해당 코드의 문제점은?
 * 이 프로그램은 무조건 87점인 경우에만 해당되는 코드로 작성되어 있다.
 * 코드에 실제값이 하드코딩 되어져 있으면 안된다.
 * 
 * 프로그램이란?
 * 들어오는 입력값에 따라서 결과값이 달라지는 것 - 동적 Dynamic Document
 * Code 상에 실제값이 있으면 동일한 결과값을 준다. - 정적 Static Document
 * 
 * 해결책
 * 실행할 때마다 실제 성적에 해당하는 값을 받아서 처리할 수 있도록 코드를 수정
 * --> Scanner 객체
 */



