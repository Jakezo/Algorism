package Programmers;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		// 총점 값
		int sum = 0 ;
		
		// 평균 값 
		float avg = 0f;
		
		// 시험 성적 
		int[] score = { 100, 81, 93, 70, 55 };
		
		// score 배열에 저장된 값을 모두 추출하여 sum 변수에 다 더한다. 
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = sum / (float) score.length ; 
		
		System.out.println("총점 : " + sum );
		System.out.println("평균 : " + avg );
		
	}
	 private static String solution(String grade) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("score의 갯수를 정하시오 >> ");
		 int scoLen = sc.nextInt();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 return grade;
		 
	 }

	}


