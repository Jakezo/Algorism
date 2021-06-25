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








