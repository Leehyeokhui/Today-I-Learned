package ioc;

public class LgTV implements TV {
	
	private AppleSpeaker speaker;
	private int price;
	
	public void setPrice(int price) {
		this.price = price;
		System.out.println(">>> setPrice() 호출");
	}
	
	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
		System.out.println(">>> setSpeaker() 호출");
	}
	
	public LgTV() {
		System.out.println(">>>>>>> LgTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("LgTV...전원 킨다(가격 : " + price + ")");

	}

	public void powerOff() {
		System.out.println("LgTV...전원 끈다");

	}

	public void volumeUp() {
		speaker.volumeUp();

	}

	public void volumeDown() {
		speaker.volumeDown();

	}

}
