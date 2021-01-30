package streamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			RandomAccessFile rf = new RandomAccessFile("src/streamTest/files/a.txt","r");
			rf.seek(13); //읽고 쓰는 위치를 지정
			int ch = rf.read();
			System.out.println((char) ch);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
