//Write a Java program to Take three numbers from the user and print the
//greatest number. 
package modal_1;

import java.util.Scanner;

public class que_1 {
	
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  int a,b,c;
		  
		  System.out.println("enter your value");
		  a = sc.nextInt();
		  b = sc.nextInt();
		  c = sc.nextInt();
		  
		
		  
		  if (a>b) {
			  
			  if (a>c) {
				  System.out.println(a);
				
			}
			  else {
				System.out.println(c);
			}
			
		}
		  else {
			  if (b>c) {
				  System.out.println(b);
				
			}
			  else {
				System.out.println(c);
			}
			
		}
		  
		  
		  
		}
		  


}
