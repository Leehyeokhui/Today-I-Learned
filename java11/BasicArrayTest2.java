package array.primitive.test;
/*
 * �迭�� ����, ����, �ʱ�ȭ ���ÿ�
 * ����� �ٸ� �迭�� ��Ҹ� copy�� �� ���� �ִ�. -> System.arraycopy()
 */
public class BasicArrayTest2 {

	public static void main(String[] args) {
		//���� 6����� ���� size�� 6�̶� �Ͱ� ������ ǥ���̴�.
		int [] target = {1,2,3,4,5,6}; //�迭 ���� �� ������ �ݵ�� ���
		int [] source = {10,9,8,7,6,5,4,3,2,1};
		
		//�迭�� �� �� ������ ����� ������ �� ����. -> ����� �����Ϸ���? -> 10ĭ¥�� �迭�� ���� ����
		//������ ���������� ���� �迭 ���� -> ó������ �˳��ϰ� �����.
		//target = {1,2,3,4,5,6,7,8,9,10};
		
		//target �迭�� ������� �״��, source�� ������ ī��
		//8,7,6,5,4,3 ���� ��µǵ��� �ۼ�
		//System Ŭ������ arraycopy()�� ����ؼ�
		System.arraycopy(source, 2, target, 0, target.length);
		
		for(int i = 0; i < target.length; i++) {
			System.out.print(target[i]+" ");
		}
		
		//���� for��
		//���� ��𿡼� ���ư��°�?
		
		for(int i : target) System.out.print(i + " ");
		
	}
}