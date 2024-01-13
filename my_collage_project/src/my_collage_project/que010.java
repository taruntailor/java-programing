//Q 9. write a java program to get the cube of a given number using the static method.

package my_collage_project;

import java.util.Scanner;

class cube
{
    static int a;
    static void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        a=sc.nextInt();
    }
    static void putdata()
    {
        System.out.println("cube: "+a*a*a);
    }
}

public class que010 {

    public static void main(String arg[])
    {
        cube.getdata();
        cube.putdata();        
    }


}
