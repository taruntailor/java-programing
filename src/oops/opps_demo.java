package oops;

import modal1.string;

class pen{
	
    static int  price = 10;
    String color = "Red";
    String company ="cello";
    
    public void toWrite(){
    	System.out.println(price+""+color+""+company);
    }
	
	
}
public class opps_demo {
	
	public static void main(String[] args) {
		
		pen p1 = new pen ();
		p1.price=50;
		p1.toWrite();
		
		pen p2 = new pen();
		p2.price=100;
		p2.toWrite();

	}
	
	
	

}
