package exam.test;
/*
 * final Ű���忡 ���ؼ� �˾ƺ���.
 * final "���� ������ ~~~ �̾�" ��� ���� Ű����
 * 
 * final ���� - "���� ������ ������" --> ����� ����
 * final �޼ҵ� - "���� ������ �޼ҵ��" --> �������̵� ����
 * final Ŭ���� - "���� ������ Ŭ������" --> ��� ����
 */
class A{
	static final int BASE_SALARY = 800; // �� ���� �ȵǴ���
	public final String test() {
		
		return "Overriding ����"; //Ȯ��
	}
}

final class B{// ��� ���� Ȯ��
	
}

/*class C extends B{ // ��� ���� Ȯ��
}*/

class D extends A{
	//BASE_SALARY = 1000; // �� �� �ٲٴ� �� Ȯ��
	/*public final String test() { // �������̵� ���ϴ� �� Ȯ��
		
		return "Overriding ����"; //Ȯ��
	}*/
}
public class FinalExamTest {

	public static void main(String[] args) {
		D d = new D();
		//D.BASE_SALARY = 1000; // ���ٲٴ� �� Ȯ��
		System.out.println("�⺻�� : " + d.BASE_SALARY);
		
		
		
	}

}
