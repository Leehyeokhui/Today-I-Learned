package memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read {
	File dir = new File("src/memo/memodir");
	String[] list = dir.list();

	public void Read(Scanner sc) {
		System.out.println("읽기 목록 입니다.");
		for (String l : list) {
			System.out.print(l + " ");
		}
		System.out.println('\n');
		System.out.print("읽고 싶은 파일의 제목을 입력하세요 : ");
		String name = sc.next();
		File f1 = new File("src/memo/memodir", name);
		if (!f1.exists()) {
			System.out.println("해당되는 제목의 파일이 없습니다.");
		} else {
			try {
				FileInputStream fi = new FileInputStream(f1);
				int ch;
				while ((ch = fi.read()) != -1) { // -1 : end of file
					System.out.print((char) ch);
				}
				fi.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
