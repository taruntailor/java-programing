//Write a Java program to print numbers between 1 to 100 which are divisible
//by 3, 5 and by both. 
package modal_1;

import java.util.Scanner;

public class ques_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=100; i++) {
			
			if(i % 3==0 || i % 5 ==0) {
				 System.out.println(i + " is divisible by both 3 and 5");
			}
			else if (i %3 ==00) {
                System.out.println(i + " is divisible by 3");

			}
			else {
                System.out.println(i + " is divisible by 5");

			}
		}
	}
}
