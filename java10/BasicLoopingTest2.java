package looping.test;
/*
 * 반복문에서의 break 사용법
 * break는 반복문 안에서 사용하는데
 * if문과 함께 사용되어서 해당하는 조건이 true이면 반복문을 빠져나간다.
 */
public class BasicLoopingTest2 {

	public static void main(String[] args) {
		//Local Variable ... 기본값이 없다.... 초기화하고 사용해야 한다.
		int num = 0;
		int total = 0;
		
		for(num = 1; num <= 100; num++) {
			total += num;
			if(total > 120) break;
		}
		System.out.println("1부터 100까지의 총합은 " + total);
		
	}

}
