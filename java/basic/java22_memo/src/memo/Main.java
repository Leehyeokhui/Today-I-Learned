package memo;

import java.io.File;
import java.util.Scanner;

/*
 * 숙제1. 메모장
memo 디렉토리 생성. 맨 처음 한 번만 생성
1. 읽기
memo 디렉토리 파일 목록 보여줌.
사용자가 읽고 싶은 파일 선택
파일 오픈해서 내용 출력
2. 쓰기
파일명 입력(중복 안됨) => 1. 새이름 입력 -> 다시 입력 2. 이어쓰기
파일 내용 키보드로 입력 /stop 입력하면 그만 입력받고
입력내용 파일에 저장
3. 종료
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		File memodir = new File("src/memo/memodir");
		if (!memodir.exists()) {
			memodir.mkdir();
		}
		m.run(sc);

	}

}
