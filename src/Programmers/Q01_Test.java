package Programmers;

public class Q01_Test {
	public static void main(String[] args) {
		int[][] spo = { { 1, 2, 3, 4, 5, }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
		
		System.out.println(spo[2].length);
	}

	private static int[] solution(int[] answers) {

		int spoCount = 3;

		int[][] spo = { { 1, 2, 3, 4, 5, }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };

		// 채점
		int[] result = new int[spoCount];
		for (int i = 0; i < answers.length; i++) {

			for (int j = 0; j < spoCount; j++) {
				if (answers[i] == spo[j][i % spo[j].length]) {
					result[j]++;
				}
			}
		}

		return answers;
	}

}