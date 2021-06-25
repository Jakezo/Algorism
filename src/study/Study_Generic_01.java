package study;

//제네릭 클래스
class ClassName<SO> {

	private SO element2; // 제네릭 변수
	
	 // SO 는 E가 되던 V가되던 머가되던 상관이 없다.

	void setG(SO element2) { // 제네릭 메소드
		this.element2 = element2;
	}

	SO getG() { // 제네릭 메소드
		return element2;
	}

}

public class Study_Generic_01 {
	public static void main(String[] args) {
		
		
		ClassName<String> a = new ClassName<String>();
		ClassName<Integer> b = new ClassName<Integer>();
		
		a.setG("101");
		b.setG(10);
		
		System.out.println("a 의 데이터: "+ a.getG() );
		// 변환된 변수의 타입 출력
		
		System.out.println("a SO 타입" + a.getG().getClass().getName());
		
		System.out.println("b의 데이터: " +  b.getG());
		
		System.out.println("b SO 타입" + b.getG().getClass().getName());
		
	
		

	}

}
