package study;

import java.util.Arrays;
import java.util.Scanner;

public class array_Quiz_04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("금액 >>   ");
		int num = sc.nextInt();

		int[][] lotto = new int[num / 1000][6];

		for (int i = 0; i < lotto.length; i++) {
			int balCou = 45;
			int[] bal = new int[balCou];

			for (int j = 0; j < bal.length; j++) {
				bal[j] = j + 1;
			}

			for (int j = 0; j < lotto[i].length; j++) {
				int rand = (int) (Math.random() * balCou); // 0~ 44, ball 배열의 인덱스

				lotto[i][j] = bal[rand];
				int lastIdx = 44 - j;

				if (rand != lastIdx) {
					bal[rand] = bal[lastIdx];
				}
				// rand
				balCou--;

			}
		}
		for (int[] arry : lotto) {
			Arrays.sort(arry);
			for (int a : arry) {
				System.out.print(a + "\t");
			}
			System.out.println();
		}

	}
}
