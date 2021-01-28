package memo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Write {

	public void Write(Scanner sc) {
		System.out.println("====== 메모 쓰기 ======");
		System.out.print("파일명 : ");
		String name = sc.next();
		File f1 = new File("src/memo/memodir", name);
		if (!f1.exists()) {
			try {
				f1.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				FileOutputStream fo = new FileOutputStream(f1);
				int ch = ' ';
				while ((ch = System.in.read()) != '\n') {
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
		} else {
			try {
				FileOutputStream fo = new FileOutputStream(f1, true);
				int ch = ' ';
				while ((ch = System.in.read()) != '\n') {
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

}
