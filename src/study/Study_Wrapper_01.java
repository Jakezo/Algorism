package study;

public class Study_Wrapper_01 {
	
	public static void main(String[] args) {
		Integer num = new Integer(17); // 박싱
		
		int n = num.intValue();
		
		System.out.println(n);
		
		Character ch = 'X';  // Character ch = new Character('X); 랑 같음 오토박싱
		
		char c = ch; // char c = ch.charValue();
		
		System.out.println(c);

	}

}
