package looping.test;
/*
 * �ݺ��������� break ����
 * break�� �ݺ��� �ȿ��� ����ϴµ�
 * if���� �Բ� ���Ǿ �ش��ϴ� ������ true�̸� �ݺ����� ����������.
 */
public class BasicLoopingTest2 {

	public static void main(String[] args) {
		//Local Variable ... �⺻���� ����.... �ʱ�ȭ�ϰ� ����ؾ� �Ѵ�.
		int num = 0;
		int total = 0;
		
		for(num = 1; num <= 100; num++) {
			total += num;
			if(total > 120) break;
		}
		System.out.println("1���� 100������ ������ " + total);
		
	}

}
