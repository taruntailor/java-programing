//timer class whith start and stop method: impliment  a timer class that records the time. 
//include START AND STOP METHOD CONTROL THE TIMER.


package dec_22_questiom;

class Timer{
	long StartTime,StopTmer;
	
	void start() {
		System.out.println("timer start");
		StartTime=System.currentTimeMillis();	
	}
	void stop() {
		System.out.println("stop timer");
		StartTime=System.currentTimeMillis();
	}
	
	void diffrence() {
		System.out.println("diffrence: "+(StartTime));
	}
}

public class ques008 {
	
	public static void main(String[] args) {
		Timer t1 = new Timer();
		t1.start();
		
		t1.stop();
		t1.diffrence();
		
		long millis = System.currentTimeMillis();		// get current time in milliseconds 
		System.out.println("millis : "+millis);
		
		
	}

}
