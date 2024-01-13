//Q 7. write a java program to add and swap of given number using nesting of mathod.

package my_collage_project;
class nest
{
    private void swap(int x,int y)
    {
        System.out.println("**********this is swap method**********");
        System.out.println("before swapping : x="+x+"y="+y);
        //swap the numbers
        int z=x;x=y;y=z;
        System.out.println("after swapping: a="+x+" b="+y);
    }
    public void sum(int a,int b)
    {
        System.out.println("********** this is sum method **********");
        System.out.println("before performing operation:a="+a+" b="+b);
        a=a+10;
        b=b+12;
        System.out.println("after operation:a="+a+" b="+b);
        //colling of swap () method from sum() method 
        swap(a,b);
    }
}

public class Ques008 {

    public static void main(String arg[])
    {
        nest aa=new nest();
        int a=20,b=30;
        aa.sum(a,b);
    }


}
