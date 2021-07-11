package study;

public class Study_Interface_01 {
	
	public abstract static class Calculator implements Calc{
		
		@Override
		public int add(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1 + num2;
		}

		@Override
		public int substract(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1 - num2;
		}

}
	public static class CompleteCalc extends Calculator{

		@Override
		public int times(int num1, int num2) {
			return num1* num2;
		}

		@Override
		public int divide(int num1, int num2) {
			
			if(num2 ==0) {
				return ER;
			}
			else {
				return num1 / num2;
			}
		}
		public void showInfo() {
			System.out.println("모두 구현했습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		/*
		 * Calculator cal = new CompleteCalc(); 
		 * 
		 * CompleteClac cal = new CompleteCalc();
		 * 
		 * 멀쓰던 값은 다 똑같이 잘 나온다.
		 */
		Calc cal = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 0;
		
		System.out.println(cal.add(num1, num2));
		System.out.println(cal.substract(num1, num2));
		System.out.println(cal.divide(num1, num2));
		System.out.println(cal.times(num1, num2));
		


		
	}
}