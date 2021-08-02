package study;

public class While_02 {
	public static void main(String[] args) {
		int i = 11;
		
		System.out.println("카운트 다운 시작");
		
		/*
		 * while(i-- != 0) { // i 감소하는게 0 이 아닐동안 System.out.println(i); }
		 */
		
		
		while(i !=0) {
			i --;
			System.out.println("이것도 같은 결과: " + i);
		}
		
		
		
		
	}
}
