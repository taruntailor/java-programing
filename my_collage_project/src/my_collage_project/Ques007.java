//Q 6. write a program to calculate area of rectangle using peramiterized constroctor..

package my_collage_project;

import java.util.Scanner;

class cal{
    public cal(double l, double w) {
    	 System.out.print("area of ractangle is:"+l*w);// TODO Auto-generated constructor stub
	}

	 
}


public class Ques007 {

    public static void main(String arg[])
    {
        double l,w;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        l=sc.nextDouble();
        System.out.println("enter width:");
        w=sc.nextDouble();
        cal aa=new cal(l,w);
    }

}
