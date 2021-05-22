package practice;

// static 없이는 이렇게 분리해서 실행하는 방법도 있다.

interface Meter {
	public void start();

	public int stop(int distance);

	public default void afterMidnight() {
		System.out.println("자정이 넘었습니다. 할증이 필요한경우 이 메소드를 오버라이드 하세요.");
	}
}

class Taxi implements Meter { 
	public void start() {
		System.out.println("택시가 출발합니다.");
	}

	public int stop(int distance) {
		int fare = distance * 2;
		System.out.println("택시가 도착했습니다. 요금은 " + fare + "입니다.");
		return fare;
	}

	public void afterMidnight() {
		System.out.println("자정이 넘었습니다. 할증이 필요합니다.");
	}
}

public class pra7 {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();

		taxi.start();
		taxi.afterMidnight();
		taxi.stop(10);

	}
}

