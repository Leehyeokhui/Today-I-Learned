package com.encore.parent;
/*
 * Overloading
 * ::
 * �̸��� ������(������ ����̴�.) ó���ϴ� �����͸� �޸��ϴ� ���
 * ::
 * 1) ������ �����ε�
 * 		--> �̸��� ������ ó���ϴ� �����Ͱ� �ٸ���.
 * 	 		�ּ����� �⺻������ �ϴ� ��ü ������ �����ϰ� �ϴ� ���
 * 			������ ������ ���Ŀ� �ٽ� �Ҵ�Ǿ��� �� �ִ�.
 * 2) �޼ҵ� �����ε�
 * ::
 * this ����
 * 1) ������ �տ� this - �ʵ�� ���ú����� �̸��� ���� �� �� 2���� �����ϱ� ���ؼ� �ʵ�� �տ� �����Ѵ�.
 * 2) this() ������ ���� this - �ϳ��� Ŭ���� �ȿ��� �Ǵٸ� �����ڸ� ȣ���ϴ� ���
 */
import com.encore.util.MyDate;

public class Employee {
	//��������� �⺻ salary���� �ϳ� ����
	public static final double BASE_SALARY = 100.0;
	
	private String name;
	private MyDate birthDate;
	private double salary;
	
	// ������ �����ε��� �� ����ϴ°�?
	public Employee() {}
	public Employee(String name, MyDate birthDate, double salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public Employee(String name){
		this(name, new MyDate(2000, 1, 1), BASE_SALARY); // 28�������� �̵�
	}// name �����ϰ� �⺻�� ����
	
	public Employee(String name, MyDate birthDate) {
		this(name, birthDate, BASE_SALARY); //28��������
	}//name, birthDate �����ϰ� �⺻�� ����
	
	/*public String getDetails() {
		return name + ", " + birthDate.getDate() + ", " + salary;
	}*/
	
	public String toString() {
		//�ּҰ��� ��Ʈ������ ���� �� ����� �ڽĿ��� �°� ���ľ��� �ʵ带 �����ϴ� �������
		return name + ", " + birthDate + ", " + salary;
	}
}
