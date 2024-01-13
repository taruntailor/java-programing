//Q 1. write a program to calculate area of rectangle.//

package my_collage_project;

import java.util.Scanner;
class aor
{
    
    double l, w, result;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length:");
        l=sc.nextDouble();
        System.out.println("enter width:");
        w=sc.nextDouble();
        
    }
    void putdata()
    {
        result=l*w;
        System.out.println("area of ractangle is:"+result);
    }
}
public class Ques_001 {
	public static void main(String[] args) {

        aor aa=new aor();
        aa.getdata();
        aa.putdata();
	}
	

}
