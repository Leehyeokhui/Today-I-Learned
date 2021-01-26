package array.primitive.test;
/*
 * 배열을 선언, 생성, 초기화 동시에
 * 사이즈가 다른 배열의 요소를 copy해 올 수는 있다. -> System.arraycopy()
 */
public class BasicArrayTest2 {

	public static void main(String[] args) {
		//값이 6개라는 뜻은 size가 6이란 것과 동일한 표현이다.
		int [] target = {1,2,3,4,5,6}; //배열 생성 시 사이즈 반드시 명시
		int [] source = {10,9,8,7,6,5,4,3,2,1};
		
		//배열은 한 번 지정한 사이즈를 수정할 수 없다. -> 사이즈를 수정하려면? -> 10칸짜리 배열을 새로 생성
		//사이즈 수정때마다 새로 배열 생성 -> 처음부터 넉넉하게 만든다.
		//target = {1,2,3,4,5,6,7,8,9,10};
		
		//target 배열의 사이즈는 그대로, source의 내용을 카피
		//8,7,6,5,4,3 으로 출력되도록 작성
		//System 클래스의 arraycopy()를 사용해서
		System.arraycopy(source, 2, target, 0, target.length);
		
		for(int i = 0; i < target.length; i++) {
			System.out.print(target[i]+" ");
		}
		
		//향상된 for문
		//뭐가 어디에서 돌아가는가?
		
		for(int i : target) System.out.print(i + " ");
		
	}
}