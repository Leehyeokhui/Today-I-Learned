package looping.test;
/*
 * break, continue
 * 반복문에서의 continue 사용법
 * continue if가 참인 경우에 반복문을 계속 한다.
 * 
 */
public class BasicLoopingTest3 {

	public static void main(String[] args) {
		//Local Variable ... 기본값이 없다.... 초기화하고 사용해야 한다.
		int num = 0;
		int total = 0;
		
		for(num = 1; num <= 10; num++) {
			if(num%2 == 0) continue;
			total += num; // 바로 아래 있는 문장은 건너뛰고 반복
		}
		System.out.println("1부터 10까지의 홀수의 총합은 " + total);
		
	}
}
