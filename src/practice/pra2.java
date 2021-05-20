package practice;


abstract class Machine{
	public abstract void turnOn();
	public abstract void turnOff();
}

class Car extends Machine{
	  public void turnOn(){
	        System.out.println("꽥꽥!!");
	    
	    }
	    public void turnOff(){}
	}

public class pra2 {
	
	public static void main(String[] args) {
		Car car = new Car();
        if(Machine.class.isInstance(car)){
            System.out.println("정답입니다. [제출]을 누르세요.");
        }
        else{
            System.out.println("Car가 Machine을 상속받지 않았습니다.");
        }
		
	}

}
