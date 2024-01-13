//Q 3. write a program to calculate simple interest.

package my_collage_project;

import java.util.Scanner;

class interest
{
    double p,r,t;
     void getdata()
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("enter amount:");
         p=sc.nextDouble();
         System.out.print("enter rate :");
         r=sc.nextDouble();
         System.out.print("enter time(year) :");
         t=sc.nextDouble();
     }
     void putdata()
     {
         System.out.println("simple interest is :"+((p*r*t)/100));
     }
}


public class Ques_003 {

    public static void main(String arg[])
    {
        interest st=new interest();
        st.getdata();
        st.putdata();
    }


}
