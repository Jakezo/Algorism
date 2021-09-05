package study;

class CallMeName{
	
//	public ConstructorEx01(){ } // Default Constructor 자동 생성

	static void print() {
		System.out.println("프린트를 합니다");
	}
	void print2() {
		System.out.println("나는 이순신입니다");
	}
}


public class Study_method_02 {
	
		public static void main(String[] args) {
		
			CallMeName.print();//인스턴스를 생성하지 않아도 호출이 가능
			
			CallMeName cal = new CallMeName();
			
			cal.print2(); //인스턴스를 생성하여야만 호출이 가능
		
	}

}
