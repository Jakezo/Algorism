package study;

import java.util.Arrays;
import java.util.Scanner;

public class array_Quiz_01 {
	public static void main(String[] args) {
		// 5명의 키를 입력 받아서 가장 큰키를 가진 사람의 이름을 출력
		
		Scanner sc = new Scanner(System.in);
		
		String [] name = {"ja","za","ie","kr","ww"};
		
		double [] tall = new double[name.length];
		
		double max = 0;
		
		
		
		String result ="";
		
		for(int i = 0; i< name.length; i++) {
			System.out.print("키 입력 >>>");
			tall[i] = sc.nextDouble();
		}
		double max2 = tall[0];
		
		for(int j =0 ; j <name.length; j++) {
			if(max2 < tall[j]) {
				max2 = tall[j];
				result = name[j];
			}
		}
		System.out.println("최대키:"+ max2 + "이름" + result ); 
		
		
		
	}
}
