/*
 * package = ���丮 = ����
 * java.io
 * Top level package.Sub level package --- "." ���� �����Ѵ�.
 * ���� ������ ����� ���� class���� ����
 * package �̸��� ���� �� �ҹ��� ���
 * ����, ���, ī�װ����� ����
 */

package condition.test;

public class SwitchRandomTest5 {

	public static void main(String[] args) {
		//dice 1 ~ 6 ������ ������ �������� �ڵ� ����
		int dice = (int) (Math.random()*6)+1;
		System.out.println(dice);
		
		/*
		 * switch���� ����ؼ� ������ ���� ���� �� dice 1
		 */
		System.out.println("\nswitch���� �̿��� dice print");
		String message = "";
		
		switch(dice) {
		 case 1 :
			message = "dice "+dice;
			 break;
		 case 2 :
			 message = "dice "+dice;
				 break;
		 case 3 :
			 message = "dice "+dice;
				 break;
		 case 4 :
			 message = "dice "+dice;
				 break;
		 case 5 :
			 message = "dice "+dice;
				 break;
		 case 6 :
			 message = "dice �� "+dice;
				 break; 
		}
		
		System.out.println(message);
	}

}
