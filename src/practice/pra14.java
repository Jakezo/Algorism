package practice;


// 좌표
class Coord {
	
	//field
	int x;
	int y; // 인스턴스 필드 
	
	// constructor
	Coord(int x, int y){  // int x int y 는 매개변수  생성자(필드 초기화)
		this.x = x;			// 종종 보았을 것이다. this는 인스턴스의 자기 자신을 의미한다. this.x 필드라 불림 
		                    //this. 는 주로 필드와(전역변수)와 메소드 또는 생성자의 매개변수가 동일할 때 인스턴스 필드임을 명확히 하기 위해 사용한다
		this.y = y;
		
	}
	Coord (Coord coord){
		// 매개변수가 2개인 다른 생성자를 호출
		this(coord.x+3, coord.y);   // 이게 매개변수 위에 생성자 호출
	}
	
	
	// method
	void info() {  // 인스턴스 메소드
		System.out.println("좌표 [" + x + "," + y + "]");
		
	}
	
	
}
class Circle {
	
	double r;
	Coord center;
	
	Circle(double r){
		this(1, 1, r);
	}
	Circle(int x, int y, double r){
		this.r = r;
		center = new Coord(x, y);
	//	center.x = x;
	//	center.y = y;	
		
	}
	double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
	void info() {
		System.out.println();
		center.info();
		System.out.print(", 반지름 : " + r + ", 크기 = " + getArea());		
	}
}

public class pra14 {
	
	public static void main(String[] args) {

		Coord coord1 = new Coord(3, 5);
		Coord coord2 = new Coord(coord1);

		coord1.info();					// 좌표 [3, 5]
		coord2.info();					// 좌표 [3, 5]
		
		Circle circle1 = new Circle(1.5);				
		Circle circle2 = new Circle(33, 55, 1.5);
		
		circle1.info();					// 좌표 [1, 1], 반지름 1.5, 크기 = 7.xx
		circle2.info();				
	}
}	
