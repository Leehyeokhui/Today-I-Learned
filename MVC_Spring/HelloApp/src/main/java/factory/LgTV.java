package factory;

public class LgTV implements TV {

	public void powerOn() {
		System.out.println("LgTV...전원 킨다");

	}

	public void powerOff() {
		System.out.println("LgTV...전원 끈다");

	}

	public void volumeUp() {
		System.out.println("LgTV...소리를 올린다");

	}

	public void volumeDown() {
		System.out.println("LgTV...소리를 내린다");

	}

}
