//Q 5. write a program to calculate area of rectangle using defoult constroctor..
package my_collage_project;

import java.util.Scanner;

class rect{
    
    double l, w, result;
    rect()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        l=sc.nextDouble();
        System.out.println("enter width:");
        w=sc.nextDouble();
        result=l*w;
        System.out.println("area of ractangle is:"+result);
    }
}

public class Ques005 {
	public static void main(String[] args) {
		rect r1 = new rect();
		
		}

}
