package streamTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("src/streamTest/files/b.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("src/streamTest/files/c.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			char[] buf = new char[50];
			
			while(br.read(buf) != -1) {
				bw.write(buf);
			}
			
			br.close();
			bw.close();
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
