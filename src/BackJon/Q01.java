package BackJon;

import java.util.Scanner;


public class Q01 {

	public static void main(String[] args) {

		q01();
		//q02();
	}

	private static void q01() {
		/*문제 : 두 개의 정수 입력 a, b를 받아서 a + b를 출력하시오
			입력 :  a, b
			출력 : a+b  */

		Scanner sc = new Scanner(System.in);

		System.out.print("정수하나 입력  ");
		int a = sc.nextInt();
		System.out.print("정수하나 입력  ");
		int b = sc.nextInt();
		
		System.out.println(a+b);
	}
	
	
	
}












