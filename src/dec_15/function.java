package dec_15;

import java.time.LocalTime;
import java.util.Calendar;

public class function {

	// with out return type and without parameter 
	static void greetings() {
		System.out.println("Namaste..");
	}
	
	/// without return type and with parameter
	static void greet(String name) {
		System.out.println("Namaste.."+name);
	}
	
	// with return type and with parameter
	static boolean isValidContact(String contact) {
		return contact.length()==10;
	}
	
	
	static String modify(String firstName, String lastName)
	{
		return firstName+" "+lastName;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("First line..");
		greetings();
		System.out.println("Second line..");
		greet("Rahul");
		greet("Ajay");
		
		// boolean isValid = isValidContact("565656");
		
		String message = "Java is Amazing..";  // here, message is String class object
		
		System.out.println("message : "+message.toUpperCase());
		
		int num = 34343434;
		
		String temp = num+"";	// convert into String 
		System.out.println("length : "+temp.length());
		
		if(isValidContact("565656")) {
			// true 
			System.out.println("valid contact number..");
		}else {
			// false
			System.out.println("invalid contact..");
		}
			
		System.out.println("modified name : "+modify("Tarun", "Tailor"));
	
		// return milliseconds 
		System.out.println(System.currentTimeMillis());;
		
		// return system time (individually)
		Calendar calender = Calendar.getInstance();
		System.out.println("date : "+calender.get(Calendar.DATE));
		System.out.println("month : "+calender.get(Calendar.MONTH));
		System.out.println("year : "+calender.get(Calendar.YEAR));
		System.out.println("hour : "+calender.get(Calendar.HOUR));
		System.out.println("hour : "+calender.get(Calendar.MINUTE));
		
		System.out.println("Current Time : "+LocalTime.now());
		
		
		// Loop Question Solution //
		// 1+11+111+1111+11111..n
		
		int n= 1;
		
		for(int i = 1; i<=5; i++) {
			System.out.print(n);
			if(i!=5)
				System.out.print("+");
			
			n = n*10 +1;
		}
		
		
	}
	

}
