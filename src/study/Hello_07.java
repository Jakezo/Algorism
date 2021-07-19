package study;

import java.util.Scanner;

public class Hello_07 {
	public static void main(String[] args) {
		
		// if 안의 값을 밖으로 꺼내는법 

		System.out.print("가위1 바위2 보3 중 하나를 입력하시오 >>> ");
		Scanner sc = new Scanner(System.in);
		String userSt = sc.next();
		int com = (int) (Math.random() * 3) + 1; // Math.random 은 원래 double 형입니다!
		System.out.println("처음 com 값이다: " + com);
		
		boolean equals1 = userSt.equals("가위");
		boolean equals2 = userSt.equals("바위");
		boolean equals3 = userSt.equals("보");   // if 값 비교는 boolean 으로 한다.
		int user = 0;   // 이렇게 미리 선언하면 if 안의값을 밖으로 꺼낼 수 있다.
		
		String comSt =null;
		// 또는 String comSt =""; 이렇게 선언
		// String comSt; 하면 오류생김
		
		if (equals1) {
			user = 1;
		}
		if (equals2) {
			user = 2;
		}
		if (equals3) {
			user = 3;
		}
		
		switch(com) {
			case 1:
				comSt="가위";
				break;
			case 2:
				comSt="바위";
				break;
			case 3:
				comSt="보";
				break;
		}
		
		/*
		 * if(com ==1) { comSt="가위"; } if(com == 2) { comSt="바위"; } if(com ==3) {
		 * comSt="보"; }
		 */
		System.out.println("내가 고른거>> " + userSt + user);

		System.out.println("컴터 >> " + comSt + com);

		switch (user - com) {
		case 1:
		case -2:
			System.out.println("내가 이겼어요");
			break;
		case 0:
			System.out.println("비겼어요");
			break;
		default:
			System.out.println("내가 졌어요");
			break;
		}
		sc.close();
	}
}
