/**
 * 
 * @author Lee HH
 * @since JDK 1.8.27 version
 * @version JavaDoc version1
 */
public class JavaDoc {

	// 기능을 하나 정의 - 함수 정의 - method definition = 선언부 + 구현부
	/**
	 * 
	 * @param java java 프로그램 성적
	 * @param algo 알고리즘 성적
	 * @return 자바성적과 알고리즘 성적의 합한 값을 반환
	 */
	public int scoreSum(int java, int algo) { // method 선언부(A.M + return type + name + argument List)
		return java + algo; // 구현부 이 method가 어떤 일을 하는 지를 여기에 지정 , 호출한 곳(Test)으로 반환된다.
	}
}
