package com.encore.pokemon;

public class Picachu extends PokeMon {
	public Picachu() {
		System.out.println("피카츄가 생성되었습니다.");
		this.name = "picachu";
		this.hp = 30;
	}

	@Override
	public void eat() {
		System.out.println(name + " 밥먹음");
		hp += 5;
	}

	@Override
	public void sleep() {
		System.out.println(name + " 잠");
		hp += 10;
	}

	@Override
	public boolean play() {
		System.out.println(name + " 놈");
		hp -= 10;
		exp += 10;
		levelUpCheck();
		return hp > 0;
	}

	@Override
	public boolean exercise() {
		System.out.println(name + " 운동함");
		hp -= 15;
		exp += 15;
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
	
	public void 전기공격() {
		System.out.println("백만볼트 공격~~");
	}
	
	
}
