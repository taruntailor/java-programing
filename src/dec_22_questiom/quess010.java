//flight booking system: create a flight class with attributes for flight  number and destination, 
//add a method to display flight information. 

package dec_22_questiom;

import java.util.Scanner;

class Flight {
	String FlightNum;
	String Destintion;

	void Display(String FlightNum, String Destintion) {
		this.Destintion = Destintion;
		this.FlightNum = FlightNum;

		System.out.println("your flight number is :" + FlightNum + "\n " + "your distintion is :" + Destintion);
	}

	void dis() {
		System.out.println("your flight number is :" + FlightNum + "\n " + "your distintion is :" + Destintion);

	}

}

public class quess010 {
	private static final String FlightNumber = null;

	public static void main(String[] args) {

		Flight f1 = new Flight();
		f1.Destintion = "goa";
		f1.dis();

		System.out.println("===================");

		Flight f2 = new Flight();
		f2.Display("kota", "d001");

	}

}
