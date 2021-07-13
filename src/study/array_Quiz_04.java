package study;

import java.util.Scanner;

public class array_Quiz_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액 >>   ");
		int num = sc.nextInt();
		
		int[][] lotto = new int[num / 1000][6];
		
		for(int i =0; i< lotto.length; i++) {
			int balCou= 45;
			int[] bal = new int[balCou];
			
			for(int j=0; j < bal.length; j++) {
				bal[j] = j +1;
			}
			
			for(int j = 0; j < lotto[i].length; j++) {
				int rand = (int)(Math.random() * balCou);
				
				lotto[i][j] = bal[rand];
				
				
				
				
				
			}
		}
		
		
	}

}
