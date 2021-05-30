package exem;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01 {
	public static String solution(String input) {
		String output = "";
		String[] arr_input = input.split("");
		ArrayList<String> arr_str = new ArrayList<>();
		for (String s : arr_input) {
			arr_str.add(s);
		}

		for (int i = 0; i < arr_str.size();) {
			String first = arr_str.get(0);
			int sum = 0;
		
			for (int j = arr_str.size() - 1; j >= 0; j--) {
			
				if (arr_str.get(j).equals(first)) {
					sum++;
					arr_str.remove(j);
				}
			}
		
			if (sum > (input.length() + 1) / 2) {
				output = "";
				System.exit(0);
			}
		}

		for (int i = 1; i < arr_input.length - 1; i++) {
			if (arr_input[i - 1].equals(arr_input[i])) {
				for (int j = i + 1; j < arr_input.length; j++) {
					if (!arr_input[j].equals(arr_input[i])) {
						String temp = arr_input[j];
						arr_input[j] = arr_input[i];
						arr_input[i] = temp;
					}
				}
			}
		}

		for (String s : arr_input) {
			output += s;
		}

		return output;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("input>> ");
		String input = sc.nextLine();
		System.out.print("output>> " + solution(input));
		
		sc.close();
	}

}
