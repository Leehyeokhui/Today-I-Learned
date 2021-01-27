package com.encore.pokemon;

public class Kkobugi extends PokeMon {
	public Kkobugi() {
		System.out.println("꼬부기가 생성되었습니다.");
		this.name = "kkobuhi";
		this.hp = 35;
	}

	@Override
	public void eat() {
		System.out.println(name + " 밥먹음");
		hp += 7;
	}

	@Override
	public void sleep() {
		System.out.println(name + " 잠");
		hp += 12;
	}

	@Override
	public boolean play() {
		System.out.println(name + " 놈");
		hp -= 9;
		exp += 11;
		levelUpCheck();
		return hp > 0;
	}

	@Override
	public boolean exercise() {
		System.out.println(name + " 운동함");
		hp -= 14;
		exp += 16;
		levelUpCheck();
		return hp > 0;
	}

	@Override
	public void levelUpCheck() {
		System.out.println(name + " 레벨업 체크");
		if(exp >= 30) {
			level++;
			exp -= 30;
			System.out.println(name + " 레벨이 1 올랐습니다.");
		}
	}
	
	public void 물대포() {
		System.out.println("물대포 공격~~!!");
	}
	
	
}
