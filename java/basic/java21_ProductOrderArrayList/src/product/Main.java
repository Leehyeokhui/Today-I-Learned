package product;
/*
 * 
숙제2. warehouse 데이터 파일에 저장
프로그램 종료 시 제품목록, 주문목록 각각 파일에 저장
프로그램 시작 시 제품목록, 주문목록 파일에서 읽어서 어레이 리스트에 추가
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		m.run(sc);
	}

}
