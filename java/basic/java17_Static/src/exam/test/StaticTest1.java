package exam.test;
//Static �� ����� ��ü���� ���� ���� ����� �� �ִ�.
//Static �� ����� Ŭ�������� �δ� �������� �̹� �޸𸮿� �ö� �ִ�.
//Ŭ������.static��� �� ���

class Member{
	static String name = "����"; // Static valuable, class valuable, ��������
	static int age = 22;
	int count = 1; // field, �������
	
	public static void getMember1() {//static method
		System.out.println("��/��/��/��/" + name);
	}
	
	public void getMember2() {//non-static method
		System.out.println("��/��/��/��/" + name); //error name�� �޸𸮿� �ö��ִµ� getMerber2()�� �޸𸮿� �ö����� �ʴ�.
	}
}

public class StaticTest1 {
	
	public static void main(String[] args) {
		//static �ϱ� ������ ��ü �������� ���� �ٷ� ���
		Member.getMember1();
		
		//non-static �ϱ� ������ ���� ���� �� ���(�޸𸮿� ���� �ø� �� ���)
		Member m = new Member();
		m.getMember2();
		
		

	}

}
