package array.primitive.test;

class ArrayExam{
	String type = "q";
	public String type() {
		return "q";
	}
}
//�迭�� Ŭ������ �������� �ʴ� ��ü�̴�.
//����� API�� ���ؼ� Ȯ���� �� ����.
public class BasicArrayTest1 {

	public static void main(String[] args) {
		//1. int Ÿ���� �迭�� ����.. 3ĭ
		int[] arr = new int[3];
		System.out.println("�迭 �ּҰ� " + arr);
		
		ArrayExam exam = new ArrayExam();
		System.out.println("Ŭ���� �ּҰ� " + exam);
		
		//2. �迭 �ȿ� �ִ� �⺻�� ���
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // int�� 0
		}
		
		//3. �ʱ�ȭ
		arr[0] = 11; arr[1] = 22; arr[2] = 33;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 
		}
		
	}

}
