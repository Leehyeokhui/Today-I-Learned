package array.primitive.self.test;

import java.util.Scanner;

/*
 * Input sample
 * Scanner로 입력받는다.
 * 6 - 배열의 사이즈와 동일
 * 1 4 4 4 5 3
 */
public class ArrayPersonTypeTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int 타입의 배열을 생성
		System.out.println("사람의 수를 입력하세요");
		int num = sc.nextInt();
		int [] people = new int[num];
		
		System.out.println("각 사람의 Type을 입력하세요");
		for(int i = 0; i < people.length; i++) {
			people[i] = sc.nextInt();
		}
		
		//for(int i : people) System.out.print(i + " "); 배열 생성 확인용
			
		int [] count = {0,0,0,0,0};
		
		for(int i = 0; i < people.length; i++) {
			switch(people[i]) {
			case 1 :
				count[0]++;
				break;
			case 2 :
				count[1]++;
				break;
			case 3 :
				count[2]++;
				break;
			case 4 :
				count[3]++;
				break;
			case 5 :
				count[4]++;
				break;
			}
		}
		//for(int i : count) System.out.print(i + " "); 배열 생성 확인
		//max값에 해당하는 인덱스를 다시 찾는다.
		
		int max = 0;
		int index = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] > max) max = count[i];
			if(max == count[i]) index = i+1;
		}
		
		System.out.println("타입 : " + index);
	}
}
