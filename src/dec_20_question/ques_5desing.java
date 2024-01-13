package dec_20_question;

import java.util.Scanner;

public class ques_5desing {
	public static void main(String[] args) {
		 double a,b;
		 Scanner sr= new Scanner (System.in);
		 System.out.println("enter fahrenheit temperature");
		 a=sr.nextDouble();
		 System.out.println("celsius is= "+celsius (a) );
		 }


	 static double celsius(double f) {
		return (f-32)*12/6;
	}
}
