package practice;

public class pra5 {

public static interface Meter{
    public abstract void start();
    public abstract int stop(int distance);
}
public static class Taxi implements Meter{
	public int BASE_FARE = 3000; // 기본요금(인터페이스에 정의한 변수는 상수라서 변경할 수 없습니다.)
    public void start(){
        System.out.println("운행을 시작합니다.");
    }
    
    public int stop(int distance){
        int fare = BASE_FARE + distance * 2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
        return fare;
    }
}
public static class TaxiMeter {
	 public static void main(String []args){
	        Taxi taxi = new Taxi();
	        System.out.println("기본요금 변경 전");
	        taxi.stop(20);
	        taxi.BASE_FARE = 2500;
	        System.out.println("기본요금 변경 후");
	        taxi.stop(20);
	        
	    }

}
}
