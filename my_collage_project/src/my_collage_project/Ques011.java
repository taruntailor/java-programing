
/*Q 10. write a program to input two number and print the
 max number using nesting of method.*/

package my_collage_project;

import java.util.Scanner;

class input
{
    int a,b;
    private void putdata()
    {
        if(a<b)
        System.out.println("max number is:"+b);
        else
        System.out.println("max number is:"+a);
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        a=sc.nextInt();
        System.out.print("enter b:");
        b=sc.nextInt();
        putdata();
    }

public class Ques011 {

    public static void main(String arg[])
    {
        input aa=new input();
        aa.getdata();    
    }

}

}
