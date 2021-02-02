package board;

import java.util.Scanner;

import board.member.Dao;
import board.member.DaoImpl;
import board.member.Member;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		m.run(sc);
	}

}
