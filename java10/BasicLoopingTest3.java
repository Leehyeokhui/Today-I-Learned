package looping.test;
/*
 * break, continue
 * �ݺ��������� continue ����
 * continue if�� ���� ��쿡 �ݺ����� ��� �Ѵ�.
 * 
 */
public class BasicLoopingTest3 {

	public static void main(String[] args) {
		//Local Variable ... �⺻���� ����.... �ʱ�ȭ�ϰ� ����ؾ� �Ѵ�.
		int num = 0;
		int total = 0;
		
		for(num = 1; num <= 10; num++) {
			if(num%2 == 0) continue;
			total += num; // �ٷ� �Ʒ� �ִ� ������ �ǳʶٰ� �ݺ�
		}
		System.out.println("1���� 10������ Ȧ���� ������ " + total);
		
	}
}
