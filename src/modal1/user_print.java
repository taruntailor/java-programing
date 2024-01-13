//Write a Java program to Take three numbers from the user and print the
//greatest number. 

package modal1;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class user_print {

	 public static void main(String[]args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("input the 1st number: ");
      int num1= in.nextInt();
      
      System.out.print("input the 2and number: ");
      int num2= in.nextInt();
      
      System.out.print("input the 3rd number: ");
      int num3 = in.nextInt();
      
      
      if(num1 > num2)
     if(num1 > num3)	  
    	 
    	 System.out.println("the greatst: "+num1);
      
     if(num2 > num1)
    	 if(num2 > num3)
        	 System.out.println("the greatst: "+num2);
     
     if (num3 > num1)
    	 if(num3 >num1)
        	 System.out.println("the greatst: "+num3);


    		 
      
	}
}
