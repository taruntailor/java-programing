//flight booking system: create a flight class with attributes for flight  number and destination, 
//add a method to display flight information. 
package dec_25_questiom;
class Flight {
	String FlightNum;
	String Destintion;
	
	Flight(){
		
	}

	 Flight(String FlightNum, String Destintion) {
		this.Destintion = Destintion;
		this.FlightNum = FlightNum;

		System.out.println("your flight number is :" + FlightNum + "\n " + "your distintion is :" + Destintion);
	}

}
public class Ques010 {
	public static void main(String[] args) {
		Flight f1 = new Flight("A124", "nagpur");
	}

}
