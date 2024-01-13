//movie  thretar  seat  resercation: write a seat class  for a  movie theatar that has a seat number 
//and method to reserve  the seat. 

package dec_22_questiom;

import java.util.Scanner;

class Seat {
	 String name ;
	 String ticket;
	 int cost;
	 
	 void movie(String name, String ticket,int cost) {
		this.name=name;
		this.ticket=ticket;
		this.cost=cost;
		
		
		
		System.out.println("enter your movie name"+name+"\n"+"enter your ticket number"+ticket+"\n"
				+"enter your movie cost "+cost);
		
	 }
	 
	 
}
public class quess011 {
	public static void main(String[] args) {
		
		Seat s1 = new Seat ();
		s1.name="brother";
		s1.ticket="";
		
	}

}
