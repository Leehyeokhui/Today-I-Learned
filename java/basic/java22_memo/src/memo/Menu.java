package memo;

import java.util.Scanner;

public class Menu {

	Write w = new Write();
	Read r = new Read();

	public void run(Scanner sc) {
		boolean flag = true;

		while (flag) {
			System.out.println("1. 읽기  2. 쓰기  3. 종료");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				r.Read(sc);
				break;
			case 2:
				w.Write(sc);
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}

}
