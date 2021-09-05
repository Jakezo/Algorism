package study;

public class Study_Method_01 {
	
	public static String stu_1() {
		
		System.out.println("동생 오빠가 물 떠오라 시킴");
		String water ="물";
		
		
		// 리턴값이 있으므로 메서드 작업 종료 부분에 return 을 명시하고
				// return 문 뒤에 리턴할 데이터(변수 또는 리터럴)를 명시
		return water;
		
//		return "물"; // 리터럴 지정 가능
		// => return 할 데이터타입이 String 이므로 리턴타입에 String 명시
	}
	
	// 3. 매개변수만 있고, 리턴값은 없는 메서드 정의
		// => 리턴값이 없으므로 리턴타입에 void 명시
		// => 메서드 호출 시 정수 1개를 전달하므로 정수를 저장할 매개변수 선언
	public static void stu_2(int money) {
		
		System.out.println("동생 : 오빠가 준 돈 = " + money + "원");
		money -=200;
		System.out.println("동생 : 오빠가 준 돈으로 과자를 사먹었다!");
		System.out.println("동생 : 남은돈 = " + money + "원");
		
		// 리턴타입이 void 이므로 리턴할 데이터가 없음
				// return; 형태로 명시하거나 생략 가능
				//		return;
	}
	// 4. 매개변수도 있고, 리턴값도 있는 메서드 정의
		// => 리턴값이 있으므로, 리턴타입 부분에 리턴할 데이터타입 명시
		// => 매개변수가 있으므로 소괄호() 안에 전달받은 데이터 저장 변수 선언
		public static String stu_3(int money) {
			// 외부로부터 전달받은 정수 200 이 매개변수 money 에 저장됨
			System.out.println("동생 : 오빠가 과자 사오라고 " + money + "원을 줬다!");
			money -= 200;
			System.out.println("동생 : 새우깡 사고 " + money + "원이 남았다!");
			
			// 리턴타입이 String 이므로 String 타입 데이터가 리턴되어야함!
			return "새우깡"; 
		}
		
		// 5. 매개변수가 2개 이상인 메서드
		// => 매개변수가 여러개일 때 해당 갯수와 타입 만큼 변수 선언 필요
		//    주의사항! 전달된 데이터의 순서대로 선언해야함!
		
		public static String sister_5(String snack, int money) {
			
			// "새우깡", 1000 을 전달했으므로 String, int 순으로 변수 선언 필요
			System.out.println("동생 : 오빠가 준 과자 = " + snack);
			System.out.println("동생 : 오빠가 준 돈 = " + money + "원");
			money -= 1000;
			snack = "쿠쿠다스";
			return snack;
		}
		
		public static void main(String[] args) {
			
//			Study_Method_01.stu_1();
//			
//			
//			Study_Method_01.stu_2(10);
//			
//			stu_1();
//			
//			stu_3(2222);
//			
			
			sister_5(null, 30);
			
			
			
			
			
			
		}
	
	

}
