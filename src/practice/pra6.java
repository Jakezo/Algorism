package practice;

public class pra6 {
	public interface Meter{
	    public void start();
	    public int stop(int distance);
	    
	    
	    public default void afterMidnight(){
	        System.out.println("자정이 넘었습니다. 할증이 필요한경우 이 메소드를 오버라이드 하세요.");
	    }
	}
	public static class Taxi implements Meter{  // 문제에서 static 붙이기 new Taxi 를 위해
	    public void start(){
	        System.out.println("택시가 출발합니다.");
	    }
	    
	    public int stop(int distance){
	        int fare = distance * 2;
	        System.out.println("택시가 도착했습니다. 요금은 "+fare+"입니다.");
	        return fare;
	    } 
	    @Override
	public void afterMidnight(){
	  System.out.println("자정이 넘었습니다. 할증이 필요합니다.");
	}
	}
	
	public static class TaxiExam{   // 문제에서 static 붙인다
	    public static void main(String[] args){
	        Taxi taxi = new Taxi();
	        
	        taxi.start();
	        taxi.afterMidnight();
	        taxi.stop(10);
	       
	        
	        
	    } 
	}
}
