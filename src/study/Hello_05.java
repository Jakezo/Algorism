package study;

import java.util.Scanner;

public class Hello_05 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		System.out.print("현재 월 입력>> ");
		int month = sc.nextInt();
		
		while(true) { 
		switch(month) {
		case 3: 
		case 4: 
		case 5:
			System.out.println("현재는 봄");
			break;
			
		case 6: case 7: case 8:
			System.out.println("현재는 여름");
			break;
		case 9: case 10: case 11:
			System.out.println("현재는 가을입니다. ");
			break;
		case 12: case 1: case 2:
			System.out.println("현재는 겨울입니다.");
			break;
		default:
			System.out.println("올바르지 않은 계절입니다");
			break;
		} 
		
		} 
	}

}
