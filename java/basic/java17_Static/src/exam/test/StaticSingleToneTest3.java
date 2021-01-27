package exam.test;
/*
 * �̱���
 * ::
 * �ϳ��� Ŭ�����κ��� ���� �� �ϳ��� ��ü�� �����ǵ��� �ۼ��ϴ� �ڵ� ����
 * ::
 * �ۼ����
 * 1. Ŭ���� �ȿ��� �ϴ� �ϳ��� ��ü�� �����س��´�. -- private static���� �����ؼ� ����
 * 2. �ٸ� Ŭ���������� ��ü������ ���ϵ��� ���Ƴ��´�. -- private ������()
 * 3. �ϳ� ����� ���� ��ü�� �������⼭ ������ ������ public �� ����� �����. -- public static
 */
class Service{ // SingleTone pattern ���� ������ ����
	private static Service service = new Service();
	private Service() {
		System.out.println("Service Instance Creating...Using SingleTone...");
	}
	public static Service getInstance() { // �̸� �޸𸮿� �÷����� �� �ֵ��� static�� �� ����
		return service;
	}
}

public class StaticSingleToneTest3 {

	public static void main(String[] args) {
		//Service s1 = new Service();
		//����� ���� ���� �޾Ƽ� ����ϴ� ��� �ۿ��� ����...
		
		Service service1 = Service.getInstance();
		Service service2 = Service.getInstance();
		Service service3 = Service.getInstance();
		
		System.out.println(service1);
		System.out.println(service2);
		System.out.println(service3);
		
		
		
		
	}

}
