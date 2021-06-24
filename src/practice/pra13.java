package practice;

class Watch {
	
	
	int hour;
	int minute;
	int second;
	
	
	Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	// method
	void addHour (int hour) {
		if (hour < 0)
			return; // // 메소드 종료
		this.hour += hour;
		this.hour %= 24;
		
	}
	void addMinute (int minute) {
		if(minute < 0)
			return;
		this.minute += minute;
		addHour(this.minute / 60);
		this.minute %= 60;
	}
	void addSecond(int second) {
		if(second < 0)
			return;
		this.second += second;
		addMinute(this.second/ 60);
		this.second %= 60;
	}
	void see() {
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}
	
}

public class pra13 {
	public static void main(String[] args) {
		Watch watch = new Watch(16, 15 ,30);
		
		watch.addHour(8);
		//watch.addMinute(61);
		// watch.addSecond(3661);
		
		watch.see();
		
	}

}




