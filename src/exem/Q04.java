package exem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputsize = scan.nextInt();
		System.out.println(inputsize);
		int arraysize = inputsize * inputsize;
		System.out.println("arraysize : " + arraysize);
		List<Integer> arraydata = new ArrayList<Integer>();
		for (int i = 0; i < arraysize; i++) {
			arraydata.add(scan.nextInt());
		}

		int cross_1; /* 첫번째 대각선위치값 저장하는 변수 */

		int cross_2; /* 두번째 대각선위치값 저장하는 변수 */

		int sum_cross_1 = 0; /* 첫번째 대각선값들 합계 저장하는 변수 */

		int sum_cross_2 = 0; /* 두번째 대각선값들 합계 저장하는 변수 */

		for (int j = 0; j < inputsize; j++) {

			cross_1 = j * inputsize + (j + 1);

			cross_2 = j * inputsize + (inputsize - j);

			System.out.print("첫번째 대각선 위치 : " + cross_1);

			System.out.println(" 의 값 : " + arraydata.get(cross_1 - 1));

			System.out.print("두번째 대각선 위치 : " + cross_2);

			System.out.println(" 의 값 : " + arraydata.get(cross_2 - 1));

			sum_cross_1 = sum_cross_1 + arraydata.get(cross_1 - 1);

			sum_cross_2 = sum_cross_2 + arraydata.get(cross_2 - 1);
		}
		System.out.println("1 대각선 합 : " + sum_cross_1);

		System.out.println("2 대각선 합 : " + sum_cross_2);
	}
}
