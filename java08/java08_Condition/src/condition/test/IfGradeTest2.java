package condition.test;

//java.lang �� �ƴ� �ٸ� ��Ű���� �ִ� Ŭ������ ����� ���� �ݵ�� import �ؼ� ����ؾ� �Ѵ�.
import java.util.Scanner;

/*
 * step2
 * ���� �� ���� �޾Ƽ� ó���ϵ��� ������ �ۼ�
 * Scanner ��ü�� ����
 */
public class IfGradeTest2 {

	public static void main(String[] args) {
		//int grade = 87;
		//Ű����� �Է��� ���� �޴� Scanner ��ü�� ����
		Scanner sc = new Scanner(System.in); 
		System.out.println("����� �̸��� �Է��ϼ��� >>");
		// Scanner Ŭ������ ���.. next(), nextLine(), nextInt()
		String name = sc.nextLine();
		System.out.println("����� ������ �Է��ϼ��� >>");
		int grade = sc.nextInt();
		
		if(grade >= 90 && grade <= 100) {
			System.out.println(name + "��, A Grade!");
		}else if(grade >= 80 && grade < 90) {
			System.out.println(name + "��, B Grade!");
		}else if(grade >= 70 && grade< 80) {
			System.out.println(name + "��, C Grade!");
		}else {
			System.out.println(name + "��, Try Again!");
		}		
	}
}

