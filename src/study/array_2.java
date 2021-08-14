package study;

import java.util.Scanner;

public class array_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] a = {
				{1,2},
				{7,8},
				{5,6}
		};
		
		// 2차원 배열의 접근(순회) 방식은 "행 우선(row"
		
		for(int i = 0; i< a.length; i++) {
			for(int j=0; j< a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
