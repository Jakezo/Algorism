package practice;

public class pra8 {
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		pra8.Cal cal = new pra8.Cal();  // pra8. 안붙여도 값은 같다.
		cal.plus();
		
		System.out.println(cal.value);
	}

}
