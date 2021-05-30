package exem;

public class Q05 {
	public static void main(String[] args) {
		double count_footsize = (320-250)/5;
		double perSize =(count_footsize-1)/count_footsize; 
		
		double percent =((Math.pow(perSize, 7)));
		
		System.out.println("BTS 멤버중 한명이라도 같은 발 사이즈가 있을 확률 >> "+percent);
		
	}

}
