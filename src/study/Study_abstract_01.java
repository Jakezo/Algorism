package study;

abstract class Coffee {
		// field
		private String beanO;
		// constructor

		public Coffee(String beanO) {
			super();
			this.beanO = beanO;
		}

		// method
		// 일반 메소드
		public void info() {
			System.out.println("커피원산지: " + beanO);
		}

		// 추상메소드(본문 작성 필요 x)
		public abstract void taste();

	}

  class Espre extends Coffee {
		// field
		private int water;

		// constructor
		public Espre(String beanO, int water) {
			super(beanO);
			this.water = water;
		}

		// method
		// 일반 메소드는 오버라이드를 하던지 말던지 알아서 처리
		// 추상 메소드는 반드시 오버라이드를 해야 함
		@Override
		public void info() {
			super.info();
			System.out.println("물의 양" + water);
		}

		@Override
		public void taste() {
			System.out.println("Espresso는 쓰다.");
		}

	}



public class Study_abstract_01 {
	public static void main(String[] args) {

		
	 Espre coffee = new Espre("탄", 20);

		System.out.println(coffee);
		coffee.info();
		coffee.taste();

	}

}
