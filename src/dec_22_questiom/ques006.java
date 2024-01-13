//vehical class with milage methode.  creat a  vehical class with attributes for make  and model. include 
//a method to calculeta milleage based on fuel consumptiona and distance trv2aled

package dec_22_questiom;

import java.io.InputStream;
import java.util.Scanner;

class Vehical {

	double fuel;
	double distence;

	void seat1() {
		double millage=fuel/distence;
		System.out.println("your millage km :"+millage+"km1");

	}
	void seat1(double a, double b) {
		 this.fuel=a;
		    this.distence=b;
		    double millage = distence/fuel;
			System.out.println("your millage km :"+millage+"km1");
	}
	


}

public class ques006 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
 		Vehical v1 = new Vehical();
        v1.fuel=280; 
 		v1.distence=5;
          v1.seat1();
          
        System.out.println("===========================");
 		Vehical v2 = new Vehical();
		v2.seat1(5,100);
		

	}

}
