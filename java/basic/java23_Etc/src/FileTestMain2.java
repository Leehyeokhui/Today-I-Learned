package streamTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTestMain2 {

	public static void main(String[] args) {
		try {
			// 파일에 1바이트씩 출력하는 스트림. 저장할 파일 경로 생성자에 지정. 파일을 쓰기로 오픈할 때는 없으면 새로 생성해 줌
			FileOutputStream fo = new FileOutputStream("src/streamTest/files/b.txt",true);//쓰기 파일은 기본이 새로쓰기
			int ch = ' ';
			while((ch = System.in.read()) != '\n') {
				fo.write(ch);
			}
			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
