package study;

public class array_Quiz_02 {
	public static void main(String[] args) {
		// 문제. 0 ~ 9사이 난수를 100개 생성
		// 각 숫자들의 생성 횟수(빈도수)를 그래프화 하여 출력
		
		int num[] = new int[100];
		int ran[] = new int[10];  // 초기화 시키면 다 0으로 시작
		
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10);
			ran[num[i]]++;
			//System.out.println(num[i]);
		}
		
		for(int i=0; i<ran.length; i++) {
			String shap ="";
			for(int j=0; j< ran[i]; j++) {
				shap += ":";
			}
			System.out.println(i+"번"+shap);
		}
		
		
		
	}

}
