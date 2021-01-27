package com.encore.pokemon;

public class Isanghaessi extends PokeMon {
	public Isanghaessi() {
		System.out.println("이상해씨가 생성되었습니다.");
		this.name = "isanghaessi";
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
		hp -= 9;
		exp += 9;
		levelUpCheck();
		return hp > 0;
	}

	@Override
	public boolean exercise() {
		System.out.println(name + " 운동함");
		hp -= 16;
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
	
	public void 넝쿨채찍() {
		System.out.println("넝쿨채찍!!!!");
	}
	
	
}
