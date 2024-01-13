package dec_20_question;

import java.util.Scanner;
public class que_6_vical {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("enter the distance trevaled in miles: ");
		double distance = src.nextDouble();
        System.out.print("Enter the amount of fuel consuel: ");
        double calculeter =src.nextDouble();
        
        double mileage = calculetar(distance, calculeter);
        System.out.println("The mileage is: " + mileage + " miles per gallon");
	}

	private static double calculetar(double distance, double calculeter) {
       if(calculeter<=0) {
    	   System.out.println("full consuiel zeo");
    	   return -1;
       }
		return  distance/calculeter;
	}

}
