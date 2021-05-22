package practice;

import practice.pra8.Cal;

public class pra9 {
	public void exec() {
		class Cal{
			int value = 0;
			public void plus() {
				value++;
			}
		}
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
		
	}
	
	
	public static void main(String[] args) {
		
		pra9 t = new pra9();
		
		t.exec();
	}

}
