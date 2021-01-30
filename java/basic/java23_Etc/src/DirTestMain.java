package streamTest;

import java.io.File;
import java.io.IOException;

public class DirTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("src/streamTest/files/testDir");
		if (!dir.exists()) {
			dir.mkdir(); // 디렉토리(폴더) 생성
		}
		File f1 = new File("src/streamTest/files/testDir/a.txt");
		if (!f1.exists()) {
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		File dir2 = new File("src/streamTest/files");
		String[] list = dir2.list(); // 디렉토리에 있는 파일 목록 반환
		for (String f : list) {
			System.out.println(f);
		}

	}

}
