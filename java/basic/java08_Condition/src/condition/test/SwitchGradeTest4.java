package condition.test;

import java.util.Scanner;

public class SwitchGradeTest4 {
		
	public static void main(String[] args) {// ������ �� main �޼ҵ���� ����
		//local Variable �޼ҵ� �ȿ� ����� ����, �⺻���� ����. ���� �Ҵ��ؾ��Ѵ�.
		//�޼ҵ� �ۿ����� ����� �� ����. ����ϸ� ����
		Scanner sc = new Scanner(System.in); //Scanner ��ü�� �������(�ʵ�,�޼ҵ�)�� �޸𸮿� �ö󰣴�.
		
		System.out.println("����� �̸��� �Է��ϼ��� >>");
		String name = sc.nextLine();
		System.out.println("����� ����� �Է��ϼ��� >>");
		String grade = sc.nextLine();
		
		//�߰�.. �޼ҵ� �ȿ��� ����Ǿ��� ������ local Variable
		String message = "";//�ݵ�� local Variable ���� �ÿ��� �ʱⰪ�� ��� �Ѵ�. ""�� ��� �Ѵ�.
		
		switch(grade) {//� �ൿ�� ���� �� �����ϴ� ���·� ���� ���δ�.
			case "A" :
				message = name + "��, ����� ������ 90~100���Դϴ�." ;
				break; //�ش� case�� ���� ���´�. -> switch������ ���� ���´�.
			case "B" :
				message = name + "��, ����� ������ 80~89���Դϴ�." ;
				break;
			case "C" :
				message = name + "��, ����� ������ 70~79���Դϴ�." ;
				break;
			default :
				message = name + "��, ����� ������ 70�� �̸��Դϴ�." ;
		}	
		
		System.out.println(message);
	}
}
