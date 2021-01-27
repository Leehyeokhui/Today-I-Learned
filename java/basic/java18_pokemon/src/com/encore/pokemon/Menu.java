package com.encore.pokemon;

import java.util.Scanner;

public class Menu {
	//멤버 변수로 캐릭터 담을 변수
	private PokeMon pokemon;
	
	public void select(Scanner sc) {
		System.out.println("캐릭터 선택");
		int x = sc.nextInt();
		if(x == 1) {
			pokemon = new Picachu();
		}else if(x == 2) {
			pokemon = new Kkobugi();
		}else if(x == 3) {
			pokemon = new Isanghaessi();
		}
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		
		while(flag) {
		System.out.println("1. 밥 먹기 2. 잠 자기 3. 놀기 4. 운동하기  5. 상태확인  6. 종료 7. 특기공격");
		
		int menu = sc.nextInt();
		switch(menu) {
			case 1 :
				pokemon.eat();
				break;
			case 2 :
				pokemon.sleep();
				break;
			case 3 :
				flag = pokemon.play();
				if(!flag) {
					System.out.println("게임종료");
				}
				break;
			case 4 :
				flag = pokemon.exercise();
				if(!flag) {
					System.out.println("게임종료");
				}
				break;
			case 5 :
				pokemon.printInfo();
				break;
			case 6 :
				flag = false;
				break;
			case 7 :
				if(pokemon instanceof Picachu) {
					((Picachu) pokemon).전기공격();
				}else if(pokemon instanceof Kkobugi) {
					((Kkobugi) pokemon).물대포();
				}else if(pokemon instanceof Isanghaessi) {
					((Isanghaessi) pokemon).넝쿨채찍();
				}break;
			}
		}
	}
}
