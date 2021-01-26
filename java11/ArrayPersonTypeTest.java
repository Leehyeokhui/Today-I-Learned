package array.primitive.self.test;

import java.util.Scanner;

/*
 * Input sample
 * Scanner�� �Է¹޴´�.
 * 6 - �迭�� ������� ����
 * 1 4 4 4 5 3
 */
public class ArrayPersonTypeTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int Ÿ���� �迭�� ����
		System.out.println("����� ���� �Է��ϼ���");
		int num = sc.nextInt();
		int [] people = new int[num];
		
		System.out.println("�� ����� Type�� �Է��ϼ���");
		for(int i = 0; i < people.length; i++) {
			people[i] = sc.nextInt();
		}
		
		//for(int i : people) System.out.print(i + " "); �迭 ���� Ȯ�ο�
			
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
		//for(int i : count) System.out.print(i + " "); �迭 ���� Ȯ��
		//max���� �ش��ϴ� �ε����� �ٽ� ã�´�.
		
		int max = 0;
		int index = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[i] > max) max = count[i];
			if(max == count[i]) index = i+1;
		}
		
		System.out.println("Ÿ�� : " + index);
	}
}
