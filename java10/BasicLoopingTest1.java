package looping.test;

public class BasicLoopingTest1 {

	public static void main(String[] args) {
		System.out.println("======== for ========");
		for(int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
			System.out.println(i + ".Hello for Looping Test");
		}
		
		System.out.println("\n======== while ========");
		int i = 0;
		while(i < 10) {
			System.out.println(i + ".Hello for Looping Test");
			i++;
		}
		
		//for�� �� �� ���� �� Ȯ���� ��, while�� ���� ���� �� �� �� ����.
		
		System.out.println("\n======== do while ========");
		int j = 0;
		do {//�� �κ��� �ݵ�� �� �� ����ȴ�.
			System.out.println(j + "..Always prints");
			j++;
		}while(j < 10);
		
	}

}
