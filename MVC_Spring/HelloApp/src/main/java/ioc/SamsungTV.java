package ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {
	@Autowired
	@Qualifier("apple")
	private AppleSpeaker speaker;
	private int price;

	public void initMethod() {
		System.out.println("객체 초기화 작업");
	}

	public void destroyMethod() {
		System.out.println("객체 삭제 전 처리할 작업");
	}

	public SamsungTV() {
		System.out.println(">>>>>>> SamsungTV 객체 생성");
	}

	public SamsungTV(AppleSpeaker speaker, int price) {
		System.out.println(">>>>>>> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV...전원 켠다(가격 :" + price +")");

	}

	public void powerOff() {
		System.out.println("SamsungTV...전원 끈다");

	}

	public void volumeUp() {
		speaker.volumeUp();

	}

	public void volumeDown() {
		speaker.volumeDown();

	}

}
