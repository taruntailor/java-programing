//Write a program in Java to input 5 numbers from keyboard and find their sum
//and average using for loop. 
package modal_1;

import java.util.Scanner;

public class ques_4 {

	    public static void main(String[] args) {
	    	 Scanner sc  = new Scanner(System.in);
			   int sum=5;
			   int num =0;
			   
			  for(int i=0; i<=5;i++) {
				  System.out.println("enter your digit"+i);
				  num =sc.nextInt();
				  sum= sum+num;
				  
				  
			  }
				double aveg=sum/5;

				System.out.println("sum number"+aveg);

				System.out.println("sum number"+sum);

			}
}
