package study;

public class Hello_03 {
	public static void main(String[] args) {
		
		System.out.println("abc\tef\bghij\nklm");
		
		
		int a = 5;
		
		float b = 2;
		
		Float c = a/b;
		
		
		
		System.out.println(c);
		
		System.out.println(c.getClass().getName());
		
		
		int j = 0;
		j = a++;
		System.out.println("a값"+a+"j값"+j);
		System.out.println(j);
		
		System.out.println(j+a);
		
		a = 5;
		j = 0;
		
		
		j = ++a;
		System.out.println("a값"+a+"j값"+j);
		System.out.println(j);
		
		int x = 5;
		x = x++ - ++x;
		
		System.out.println(x);
		
		
	}

}
