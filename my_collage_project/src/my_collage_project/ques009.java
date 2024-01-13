/*Q 8. write a java program to calculate area of circle cicamference of circle and area
 of circle and area of rectangle using method overloading.*/

package my_collage_project;

import java.util.Scanner;

class a
{       
    double pi=3.14;
    Scanner sc=new Scanner(System.in);
    int r;
    void area()
    {
        System.out.println("location class a enter radios:");
        r=sc.nextInt();
        System.out.println("area of circle is:"+(pi*r*r));
    }
    void cicamferens()
    {
        System.out.println("cicamferens of circle is:"+(2*pi*r));
    }
}
class b extends a
{
    double pi=3.14;
    Scanner sc=new Scanner(System.in);
    int r;
    void area()
    {
        System.out.println("location class B enter radios:");
        r=sc.nextInt();
        System.out.println("area of circle is:"+(pi*r*r));
    }
    void rectangle()
    {
        System.out.println("enten length:");
        int l=sc.nextInt();
        System.out.println("enter width:");
        int w=sc.nextInt();
        System.out.println("area of ractangle is:"+l*w);
    }
}
public class ques009 {

    public static void main(String arg[])
    {
        b bb=new b();
        bb.area();
        bb.cicamferens();
        bb.rectangle();
    }


}
