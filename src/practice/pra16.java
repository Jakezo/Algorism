package practice;

class Gun {
	// this 는 필드와 같은 이름을 가진 매개변수가 있을때 구	분하기 위해 사용
	
	// field
	String model;
	int bullet;  // 0~FULL_BULLET
	final int FB = 6;
	
	// constructor
	
	Gun (String model, int bullet){
		this.model = model;
		this.bullet = bullet > FB ? FB : bullet;
	}
	// method
	void reload(int bullet) {
		if(this.bullet + bullet <= FB) {
			System.out.println("*********총알을 " + bullet+"발을 넣어본다" +" (최대"+FB+"발 가능한총)**********" );
			this.bullet += bullet;
			System.out.println(bullet + "발이 장전 되었다. 현재" + this.bullet + "발 쏠수있다.");
		}
		else {
			System.out.println("*********총알을 " + bullet+"발을 넣어본다" +" (최대"+FB+"발 가능한총)**********" );
			int now_bullet = (FB-this.bullet);
			System.out.println((now_bullet) + "발이 장전되었다 현재" +FB + "발 쏠수 있다");
			System.out.println("총알이"+(bullet-now_bullet)  +"발이 남아 있다.");
			this.bullet = FB;
			
		}
	}
	
	void shoot() {
		if(bullet > 0) {
			bullet--;
			System.out.println("빵야! " + bullet + "발 남았다.");
			
		}else 
			System.out.println("헛빵");
	}
	
	
	void info() {
		System.out.println(model + "(" + bullet+"발 남음" + ")");
		
	}
}
class Sol {
	// field
	String name;
	Gun pistol;
	
	// constructor
	
	Sol(String name, Gun gun) {
		this.name = name;
		this.pistol= gun;
	}
	// method
	void reload(int bullet) {
		pistol.reload(bullet);
	}
	void shoot() {
		pistol.shoot();
	}
	void info() {
		System.out.print(name +":");
		pistol.info();
	}
}

public class pra16 {
public static void main(String[] args) {
		
		Gun gun = new Gun("K-2", 2);
		Sol soldier = new Sol("짱구", gun);
		
		soldier.shoot();   // 빵야!, 1발 남았다.
		soldier.shoot();   // 빵야!, 0발 남았다.
		soldier.shoot();   // 헛빵!
		
		soldier.reload(1); // 1발이 장전되었다. 현재 1발
		soldier.reload(2); // 3발이 장전되었다. 현재 3발
		soldier.reload(1); // 3발이 장전되었다. 현재 6발
		
		soldier.shoot();   // 빵야!, 5발 남았다
		
		soldier.info();
		

	}


}











