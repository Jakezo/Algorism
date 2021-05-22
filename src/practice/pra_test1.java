package practice;

import java.util.Scanner;

public class pra_test1 {
	
	
	// 자연수 n을 입력 받아 n의 약수를 모두 더한 값을 리턴하는 함수 , answerurtion 을 완성해주시오
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 약수를 적으세요>> ");
		int n = sc.nextInt();
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
			
			int yak = n / i;
			answer += yak;
			}
		}
		System.out.println("약수의 합: " + answer);
		
	}

}
