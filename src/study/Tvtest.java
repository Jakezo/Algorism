package study;

class Tv{
	
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능(메서드)
	
	void power() {
		power =! power;   // TV를 켜거나 끄는 기능을 하는 메서드
	}
	void chaUp() {
		++channel;		// TV의 채널을 높이는 기능을 하는 메서드		
	}
	void chaDown() {
		--channel;		// TV의 채널을 낮추는 기능을 하는 메서드
	}
	
	
}



public class Tvtest {
	
	public static void main(String[] args) {
		
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.chaDown();
		System.out.println("현재 채널은" + t.channel + "입니다.");
		
		
	}

}
