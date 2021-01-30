package streamTest;

import java.io.File;
import java.io.IOException;

public class FileTestMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("src/streamTest/files/ads.txt");
		if (!f.exists()) { // 이 객체가 갖는 경로의 파일이 존재하면 true, 아니면 false
			try {
				f.createNewFile(); //파일 생성
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("파일 경로 : " + f.getAbsolutePath());
		System.out.println("파일명 : " + f.getName());
		if (f.canRead()) {
			System.out.println("읽기 가능함");
		}
		if (f.canWrite()) {
			System.out.println("쓰기 가능함");
		}
		if (f.canExecute()) {
			System.out.println("실행 가능함");
		}
		f.delete(); // 파일 삭제
	}

}
