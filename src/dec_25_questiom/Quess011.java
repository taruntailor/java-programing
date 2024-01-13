//movie  thretar  seat  resercation: write a seat class  for a  movie theatar that has a seat number 
//and method to reserve  the seat. 
package dec_25_questiom;
class Seat {
	 String name ;
	 int ticket;
	 int cost;
	 
	 Seat(){
		 
	 }
	  Seat(String name, int ticket,int cost) {
		this.name=name;
		this.ticket=ticket;
		this.cost=cost;
		
		System.out.println("enter your movie name"+name+"\n"+"enter your ticket number"+ticket+"\n"
				+"enter your movie cost "+cost);
 }
	 }
	
public class Quess011 {
public static void main(String[] args) {
	
	Seat s1 = new Seat("jay" ,15,100 );

}	

}
