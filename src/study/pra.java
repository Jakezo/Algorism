package study;

public class pra {
	
	
	
	public static void main(String[] args) {
		
		int totalSum = 0;
				
		for(int i = 1; i <100; i++) {
			if(i%2 !=0) {
				totalSum += i;
			}
		}
		System.out.println(totalSum); // 홀수의 합
	}

}
