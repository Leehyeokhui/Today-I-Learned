package condition.test;

import java.util.Scanner;

public class SwitchGradeTest3 {
		
	public static void main(String[] args) {
		//local Variable �޼ҵ� �ȿ� ����� ����, �⺻���� ����. ���� �Ҵ��ؾ��Ѵ�.
		//�޼ҵ� �ۿ����� ����� �� ����. ����ϸ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� �Է��ϼ��� >>");
		String name = sc.nextLine();
		System.out.println("����� ����� �Է��ϼ��� >>");
		String grade = sc.nextLine();
		
		switch(grade) {//� �ൿ�� ���� �� �����ϴ� ���·� ���� ���δ�.
			case "A" :
				System.out.println(name + "��, ����� ������ 90~100���Դϴ�.");
				break;
			case "B" :
				System.out.println(name + "��, ����� ������ 80~89���Դϴ�.");
				break;
			case "C" :
				System.out.println(name + "��, ����� ������ 70~79���Դϴ�.");
				break;
			default :
				System.out.println(name + "��, ����� ������ 70�� �̸��Դϴ�." );
		}	
	}
}
