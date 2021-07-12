package study;

import java.util.Scanner;

public class array_Quiz_03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] name = { "잭", "김","총점","과평" };
		String[] subject = { "국어", "영어", "수리", "과탐","합계","개인평균" };
		

		double[][] score = new double[name.length][subject.length];

		for (int i = 0; i < name.length-2; i++) {
			for (int j = 0; j < subject.length-2; j++) {
				System.out.print(name[i] + "의 ");
				System.out.print(subject[j] + "점수 >>>>");
				score[i][j] = sc.nextDouble();
				
				score[i][subject.length-2]+= score[i][j];  // 합계
				double sum = (double)(score[i][subject.length-2]);
				
				score[name.length-2][j] += score[i][j];  // 총점
				
				double chung = score[name.length-2][j];
				
				score[name.length-2][subject.length-2] += score[i][j];  // 전체합계
				
				
				score[i][subject.length-1] += (double)(sum/(subject.length-2));  // 개인평균
				score[name.length-1][j] += (double)(chung/(name.length-2));  // 개인평균
				
				
			}

		}
		System.out.println("성적 결과");
		System.out.print("\t");
		for (int j = 0; j < subject.length; j++) {
			System.out.print(subject[j] + "\t");
		}
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < subject.length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

	}
}