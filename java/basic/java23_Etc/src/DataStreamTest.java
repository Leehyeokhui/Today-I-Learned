package streamTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo = new FileOutputStream("src/streamTest/files/d.txt");
			DataOutputStream df = new DataOutputStream(fo);
			df.writeByte(10);
			df.writeChar('v');
			df.writeUTF("hello");
			df.writeFloat(2.34f);
			df.writeBoolean(true);
			df.close();
			fo.close();
			
			FileInputStream fi = new FileInputStream("src/streamTest/files/d.txt");
			DataInputStream di = new DataInputStream(fi);
			System.out.println(di.readByte());
			System.out.println(di.readChar());
			System.out.println(di.readUTF());
			System.out.println(di.readFloat());
			System.out.println(di.readBoolean());
			di.close();
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
