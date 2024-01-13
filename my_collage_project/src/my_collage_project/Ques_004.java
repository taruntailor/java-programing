//Q 4. write a program to swap simple number.

package my_collage_project;

import java.util.Scanner;

class simple
{
    int a,b,c;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value a:");
        a=sc.nextInt();
        System.out.println("enter value b:");
        b=sc.nextInt();
        
    }
    void putdata()
    {
        c=a;a=b;b=c;
        System.out.println("a="+a+" b="+b);
    }
}

public class Ques_004 {

    public static void main(String arg[])
    {
        simple si=new simple();
        si.getdata();
        si.putdata();
    }

}
