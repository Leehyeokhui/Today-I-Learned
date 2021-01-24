package operator.test;
//�ڹٿ��� ����ϴ� �⺻���� �����ڸ� �˾ƺ���.
public class OperatorTest1 {

	public static void main(String[] args) {
		Operator op1 = new Operator();// ��ü����, Operator�� ������Ұ� �޸𸮿� �ö󰣴�.
		Operator op2 = new Operator();// method�� �������� == ȣ���ϱ� ����
		
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op1 == op2);
		op1 = op2; // �ּҰ��� op2�� ������
		System.out.println(op1 == op2);
		
		//Short Circuit
		System.out.println(op1.test1() || op1.test2()); // ���� True�� ������ true(�ڴ� �ǳʶڴ�.)
		System.out.println(op1.test2() && op2.test1()); // ���� false�� ������ false(�ڴ� �ǳʶڴ�.)
		
		//local Variable ����� �ʱ�ȭ
		int i = 5; // = �Ҵ�, assign ������ ���� ���ʿ� �Ҵ�
		int j = 3;
		
		System.out.println(i == j); // == ����.
		System.out.println(i != j); // != �ٸ���.
		System.out.println("������ % : " + i % j );// % ������
		
		boolean flag = false;
		System.out.println(flag);
		System.out.println(!flag); // !variable �ƴϴ�. 
		
		int k = 10;
		System.out.println(k++); // ���� ��++ ���� ���� 1�� �߰��Ѵ�. --�� ��������
		System.out.println(k);
		
		int m = 10;
		System.out.println(++m); // ++���� �� 1�� ���� ������Ų��. --�� ��������
		System.out.println(m);
	}

}

//Ŭ������ �������� ���� �� ������ ���� ���� main method�� ������ �ִ� Ŭ���� ������ �����Ѵ�.
//���ϸ��� ���� Ŭ������ public�� ������ �ٸ� Ŭ������ public�� ������ ������.
class Operator {
	public boolean test1() {
		System.out.println("test1() calling....");
		return true;
	}
	
	public boolean test2() {
		System.out.println("test2() calling....");
		return false;
	}
	
}




