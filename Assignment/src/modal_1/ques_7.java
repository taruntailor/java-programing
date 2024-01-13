////Write a Java program that reads a positive integer and count the number of
//digits the number.
//Input an integer number less than ten billion: 125463 Number of digits in the
//numb/er: 6 ///
package modal_1;

import java.util.Scanner;

public class ques_7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
				System.out.print("enter your positive digit");
				Scanner sc1 = new Scanner(System.in);
				int number = sc1.nextInt();
 
				int p =sc1.nextInt();
				String size =Integer.toString(p);
				
				System.out.println("number of digit :"+size.length());
				
		
	}

}
