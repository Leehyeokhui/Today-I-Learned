package array.primitive.test;

class ArrayExam{
	String type = "q";
	public String type() {
		return "q";
	}
}
//배열은 클래스가 존재하지 않는 객체이다.
//멤버를 API를 통해서 확인할 수 없다.
public class BasicArrayTest1 {

	public static void main(String[] args) {
		//1. int 타입의 배열을 생성.. 3칸
		int[] arr = new int[3];
		System.out.println("배열 주소값 " + arr);
		
		ArrayExam exam = new ArrayExam();
		System.out.println("클래스 주소값 " + exam);
		
		//2. 배열 안에 있는 기본값 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // int라서 0
		}
		
		//3. 초기화
		arr[0] = 11; arr[1] = 22; arr[2] = 33;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 
		}
		
	}

}
