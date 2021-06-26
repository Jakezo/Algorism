package study;

class ClassName2<K, V> {	
	private K first;	// K 타입(제네릭)
	private V second;	// V 타입(제네릭) 
	
	void set(K first, V second) {
		this.first = first;
		this.second = second;
	}
	
	K getFirst() {
		return first;
	}
	
	V getSecond() {
		return second;
	}
}
 
// 메인 클래스 
public class Study_Generic_02 {
	
	public static void main(String[] args) {
		
		ClassName2<String, Integer> a = new ClassName2<String, Integer>();
		
		a.set("101", 10);
		
		
		System.out.println("first data:" + a.getFirst());
		
		System.out.println(" K Type: " + a.getFirst().getClass().getName());
		
		
		System.out.println(" V Type: " + a.getSecond().getClass().getName());
		
		
	}

}

/*
 * 이렇게 외부 클래스에서 제네릭 클래스를 생성할 때 
 * <> 괄호 안에 타입을 파라미터로 보내 제네릭 타입을 지정해주는 것.
 *  이 것이 바로
 * 제네릭 프로그래밍이다.
 * 
 */


