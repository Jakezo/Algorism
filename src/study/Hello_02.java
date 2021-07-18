package study;

import java.util.Scanner;

public class Hello_02 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("두자리 정수를 입력하시오 >>> ");
	
	String input = sc.nextLine();
	
	int num = Integer.parseInt(input);
	
	System.out.println("입력내용" + input);
	
	System.out.println("입력한 숫자는: " + num);
	
	
	char ch = 66;
	
	System.out.println(ch);
		
	}
}
