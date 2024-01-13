//Q 2. write a program to calculate area of circle. 

package my_collage_project;

import java.util.Scanner;

class demo
{
    double pi=3.141592653;
    void area(int r)
     {
       System.out.println("area of circle is="+pi*r*r);
     }  
}

public class Ques_002 {
	
	     public static void main(String ar[])
	     {
	         Scanner sc=new Scanner(System.in);
	         int a;
	         System.out.print("enter number:");
	         a=sc.nextInt();
	         demo aa=new demo();
	         aa.area(a);
	         
	     }
	 
}
