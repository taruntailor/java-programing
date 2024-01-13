
//• Write a Java program to display the system time. 

package modal_1;

import java.awt.DisplayMode;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class que_11 {
	public static void main(String[] args) {
		
		LocalTime   currenttime = LocalTime.now();
		
		System.out.println("current system time" + currenttime);
		
	}

}
