//vehical class with milage methode.  creat a  vehical class with attributes for make  and model. include 
//a method to calculeta milleage based on fuel consumptiona and distance trv2aled
package dec_25_questiom;

import dec_25_questiom.Vehical;

class Vehical {

	double fuel;
	double distence;

	 Vehical() {
		double millage=fuel/distence;
		System.out.println("your millage km :"+millage+"km1");

	}
	 Vehical(double a, double b) {
		 this.fuel=a;
		    this.distence=b;
		    double millage = distence/fuel;
			System.out.println("your millage km :"+millage+"km1");
	}
	


}
public class Quess006 {
	public static void main(String[] args) {
 		Vehical v2 = new Vehical(5, 100);

	}

}
