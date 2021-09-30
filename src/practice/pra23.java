package practice;

import java.util.Arrays;

public class pra23 {
	public static void main(String[] args) {
		
		int [] aa = {7, 3, 1, 3, 11, 44};
		int [] bb = null;
		
		bb = aa;
		
		System.out.println(bb);
		
		for(int arr : aa) {
			System.out.print(arr);
		}
		System.out.println();
		for(int arr : bb) {
			System.out.print(arr);
		}
		System.out.println();
		Arrays.sort(aa);
		for(int arr : aa) {
			System.out.print(","+arr);
		}
		System.out.println();
		for(int arr : bb) {
			System.out.print(","+arr);
		}
		// bb는 정렬 안했어도 자동 정렬됨 
		
		
	}
}
