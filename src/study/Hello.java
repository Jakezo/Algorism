package study;

public class Hello {
	public static void main(String[] args) {
		System.out.println("HHHHHAAAAA");  // 변수란 단 하나의 값을 저장할 수 있는 메모리공간
		
		int x = 10;
		
		int y = 20;
		
		int tmp;
		
		tmp = x;  // tmp로 값 넘겨도 x값은 그대로 복사한느낌임
		x = y;
		y = tmp;
		
		int age = 14;
		
		System.out.printf("age, %d" , age);
		
		System.out.println();
		System.out.println(y);
		System.out.println(x);
	}

}
