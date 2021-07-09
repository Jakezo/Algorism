package study;

public class Study_abstract_03 {
	public static abstract class Car{
		public abstract void drive();
		public abstract void stop();
		
		public void startCar(){
			System.out.println("시동을 켭니다.");
		}
		
		public void turnOff() {
			System.out.println("시동을 끕니다.");
		}
		
		final public void run() {
			startCar();
			drive();
			stop();
			turnOff();
		}
		
	}
	
	public static class ManualCar extends Car{

		@Override
		public void drive() {
			System.out.println("사람이 운전합니다.");
			System.out.println("사람이 핸들을 조작합니다.");

			
		}

		@Override
		public void stop() {
			System.out.println("멈춥니다.");
			
		}
		
	}
	
	public static class AICar extends Car{
		
		@Override
		public void drive() {
			System.out.println("자율주행한다");
			System.out.println("자동차가 스스로 핸들을 바꾼다");
			
		}
		
		@Override
		public void stop() {
			System.out.println("스스로 멈춘다.");
		}
	}
	
	public static void main(String[] args) {
		
		Car ai = new AICar();
		Car ma = new ManualCar();
		
		ai.run();
		System.out.println("=====================");
		ma.run();
		
	}
}
 