package BackJon;

import java.util.Scanner;

public class Q1008 {  // 백준에 제출할땐 무조건 Main 클래스에 제출 public class Main 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A>=2 && B<=10000 && C <=10000) {
		System.out.println((A+B)%C);
		System.out.println((A%C+B%C)%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		} else {
			System.out.println("(2 ≤ A, B, C ≤ 10000)");
		}
		sc.close();
		
		
	}

}
