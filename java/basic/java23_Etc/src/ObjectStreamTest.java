package streamTest;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable {// ObjectOutputStream, ObjectInputStream의 대상 객체는 Serializable 상속 받아야함.
	String id;
	String pwd;
	String name;

	public Member() {
	}

	public Member(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + "]";
	}

}

public class ObjectStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("aaa", "333", "namea");
		Member m2 = new Member("bbb", "222", "nameb");
		Member m3 = new Member("ccc", "222", "nameb");

		try {
			FileOutputStream fo = new FileOutputStream("src/streamTest/files/e.dat");
			ObjectOutputStream oo = new ObjectOutputStream(fo); // 객체 단위로 쓰는 ObjectOutputStream 객체 생성
			oo.writeObject(m1);
			oo.writeObject(m2);
			oo.writeObject(m3);
			oo.close();
			fo.close();

			FileInputStream fi = new FileInputStream("src/streamTest/files/e.dat");
			ObjectInputStream oi = new ObjectInputStream(fi);// 객체 단위로 읽는 ObjectInputStream 객체 생성
			Member m6 = (Member) oi.readObject(); // 객체 하나를 읽어서 Object타입으로 반환하기 때문에 downcasting
			Member m4 = (Member) oi.readObject();
			try {
				Member m5 = (Member) oi.readObject();
				System.out.println(m5);
			} catch (EOFException e) {

			}
			System.out.println(m6);
			System.out.println(m4);

			oi.close();
			fi.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
