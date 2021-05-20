package BackJon;

import java.util.Scanner;

public class Q01_pra {

	public static void main(String[] args) {

		// q01();
		// q02();
		q03();
	}

	private static void q01() {
		/*
		 * 문제 : 두 개의 정수 입력 a, b를 받아서 a + b를 출력하시오 입력 : a, b 출력 : a+b
		 */

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int b = sc.nextInt();

		System.out.println(a + b);

	}

	private static void q02() {
		/*
		 * 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를
		 * 지각하고 있다.
		 * 
		 * 상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
		 * 
		 * 이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
		 * 
		 * 바로 "45분 일찍 알람 설정하기"이다.
		 * 
		 * 이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더
		 * 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
		 * 
		 * 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
		 */

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("일어날 시간을 입력하세요 >>  ");
			int H = sc.nextInt();
			if (H < 23 && H > 0) {
				if (H != 0) {
					H--;
				} else {
					H += 23;
				}
			} else {
				System.out.println("시간은 0시 ~ 23 시까지 설정 가능합니다.");
				continue;
			}
			System.out.print("일어날 분을 입력하세요 >>  ");
			int M = sc.nextInt();
			if (M < 59 && M > 0) {
				if (M >= 45) {
					M -= 45;
				} else {
					M += 15;
				}
			} else {
				System.out.println("분은 0 ~ 59분 까지 설정 가능합니다");
				continue;
			}
			System.out.print("알람을 맞출 시간은 " + H + "시" + M + "분 입니다.");
			break;
		}

	}

	private static void q03() {
		// N 단을 입력 받은 뒤 그 구구단을 출력하시오
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("원하시는 단을 적어주세요>  ");
			int dan = sc.nextInt();
			if (dan > 0 && dan < 10) {
				for (int i = 1; i < 10; i++) {
					System.out.println(dan + "X" + i + "=" + dan * i);
				}
				break;
			} else {
				System.out.println("1에서 9 까지의 숫자를 다시 입력하시오");
				continue;
			}
		}
	}
}
