/*
 * ����̶�?
 * �־��� ������ ���϶��� �ش� �ڵ����� �����ϴ� ����
 * ������ �־ ������ �帧�� ���������ν� �� �� ������ ���α׷��� �� �� �ֵ��� ���ش�.
 * ::
 * <<Syntax>>
 * if(boolean_expression){
 *   //code block;
 * }else if(boolean_expression2){
 * 	 //code block;
 * }else{
 * 	 //code block;
 * }
 * state�� �� �� �϶����� {} ��������
 * 
 * ��������
 * &(and)	|(or)
 * &&		||		-- Short Circuit 
 * ---> ����� ������ ����� ����ȴ�.
 * �޺κ� ������ ������ ���� �������ν� �޺κп��� �߻��� �� �ִ� ���ܸ� �ǳʶ� �� �ִ�.
 */

package condition.test;

public class IfGradeTest1 {

	public static void main(String[] args) {
		int grade = 87;
		
		if(grade >= 90 && grade <= 100) {
			System.out.println("A Grade");
		}else if(grade >= 80 && grade < 90) {
			System.out.println("B Grade");
		}else if(grade >= 70 && grade< 80) {
			System.out.println("C Grade");
		}else {
			System.out.println("Try Again");
		}		
	}
}

/*
 * �ش� �ڵ��� ��������?
 * �� ���α׷��� ������ 87���� ��쿡�� �ش�Ǵ� �ڵ�� �ۼ��Ǿ� �ִ�.
 * �ڵ忡 �������� �ϵ��ڵ� �Ǿ��� ������ �ȵȴ�.
 * 
 * ���α׷��̶�?
 * ������ �Է°��� ���� ������� �޶����� �� - ���� Dynamic Document
 * Code �� �������� ������ ������ ������� �ش�. - ���� Static Document
 * 
 * �ذ�å
 * ������ ������ ���� ������ �ش��ϴ� ���� �޾Ƽ� ó���� �� �ֵ��� �ڵ带 ����
 * --> Scanner ��ü
 */



