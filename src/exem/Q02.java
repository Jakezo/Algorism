package exem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q02 {
	public static void main(String[] args) {
		String word = "power"; // 스트링 문자 POWER
		String checkWord = "pow";
		String[] array_word; // 스트링을 담을 배열
		String[] array_checkWord; // 체크 스트링을 담을 배열

		
		array_word = word.split(""); // 배열에 한글자씩 저장하기
		array_checkWord = checkWord.split(""); // 배열에 한글자씩 저장하기

		int count = 0;
		for (int i = 0; i < array_word.length; i++) { 

			for (int j = 0; j < array_checkWord.length; j++) { 

				List<String> list = new ArrayList<>(Arrays.asList(array_word[i]));
				Iterator<String> it = list.iterator();
				while (it.hasNext()) {
					String str = it.next();
					if (array_checkWord[j].equals(str)) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
