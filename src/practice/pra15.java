package practice;


	class Sta{
		int instanceField = 1; // 인스턴스 필드 
		static int staticField = 1; // 정적 필드
		
		public void instanceMethod(){ // 인스턴스 메소드
			this.instanceField = 1; // this 사용 가능
			instanceField = 1; // 인스턴스 필드 사용 가능
			staticField = 1; // 정적 필드 사용 가능
		}
		
		public static void staticMethod(){ // 정적 메소드
//			this.instanceField = 5; this 사용 불가(컴파일 에러)
//			instanceField = 1; // 인스턴스 필드 사용 불가(컴파일 에러)
			staticField = 1; // 정적 필드 사용 가능
		}
	}

	public class pra15 {
		public static void main(String[] args) { // 정적 메소드(main)
			Sta.staticField = 1; // A클래스 정적 필드 사용 가능
//			Sta.instanceField = 1; // A클래스 인스턴스 필드 사용 불가(필요시 인스턴스 생성 후 호출)
			Sta.staticMethod(); // A클래스 정적 메소드 사용 가능
//			Sta.instanceMethod(); // A클래스 인스턴스 메소드 사용 불가(필요시 인스턴스 생성 후 호출)
		}
	
}
