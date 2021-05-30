package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pra11 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		String result;
		
		
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			result = f(n) + " " + f(n+1); //
			 System.out.println(result);
			 System.out.println("에프엔"+f(n));
			 System.out.println("에프엔다음"+f(n+1));
		}
		
		
	}
	// 피보나치 함수
	public static int f(int n) {
		// n 이 0일 경우 초기값
		int a = 1; // f(0)
		int b = 0; // f(1)
		int c = 1; // f(0) + f(1)
		
		if (n==0) {
			return 1;
		}else if (n==1) {
			return 1;
		}else {
			for (int i=1; i<=n; i++) {
				a=b;
				b=c;
				c=a+b;
			}
			return a;
		}
		
		
		
	}

}
