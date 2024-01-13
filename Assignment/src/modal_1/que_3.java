//• Write a Java program that takes a year from user and print whether that year
//is a leap year or not. B19. Write a program in Java to display the first 10
//natural numbers using while loop
package modal_1;

import java.util.Scanner;

public class que_3 {
	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		int year;

		System.out.println("enter your year");
		year =sc.nextInt();
		
		 if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			 System.out.println("your year is leap year ");
			 
		 }else {
			 System.out.println("your year is not leap year ");
		 }
	}

}
