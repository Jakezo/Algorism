package study;

import java.util.Scanner;

public class Hello_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String position =sc.next(); 
		
		int salary = 0; // 여기서 변수 선언!!  이것이 if 안의 값 꺼내기 핵심

		if (position != null) { // null 이 아닌 경우에만 if 블럭 안으로 진입
		if (position.equals("1")) {
		salary = 80; // 변수 선언하지 않음
		} else if (position.equals("2")) {
		salary = 120; // 변수 선언하지 않음
		} else if (position.equals("3")) {
		salary = 140; // 변수 선언하지 않음
		} else if (position.equals("4")) {
		salary = 160; // 변수 선언하지 않음
		} else if (position.equals("5")) {
		salary = 180; // 변수 선언하지 않음
		}
		}
		
		System.out.println(salary);
}
}



