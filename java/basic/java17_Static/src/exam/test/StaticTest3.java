package exam.test;
//Static ��� �ȿ����� this ��� �Ұ�
//Static Initialization Block

public class StaticTest3 {
	static int size = 111;
	
	public static void main(String[] args) {
		//this.size = size; ����
		System.out.println("1. main method static block"+size);
	}
	
	static {// static Initialization block
		size = 333;
		System.out.println("2. static Initialization block" + size);
	}
}
