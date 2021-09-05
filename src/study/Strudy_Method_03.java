package study;

	
	
	
class Carino{
	String company =" 현대차";
	String model ="그렌져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	Carino(String color, int speed){
		this.color = color;
		this.speed =speed;
		
	}
	
	
 }

public class Strudy_Method_03 {
	public static void main(String[] args) {
		
		 Carino ca = new Carino("브랙", 3333);
		 
		 System.out.println("제작회사>" + ca.company);
		 
		 System.out.println("색" + ca.color);
		 
		 System.out.println("속도" + ca.speed); 
		 
		 
		
		
	}


}
