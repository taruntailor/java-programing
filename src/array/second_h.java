package array;

public class second_h {
	public static void main(String[] args) {
		
		int a[] = {10,20,3,45,89,5,89,4,66};
         int max = a[0];
         int second = a[1];
     	
// 		         for(int i=0;i<a.length;i++)
        		 for(int i=0; i<a.length;i++) 
 		         {
        			    if (a[i] > max)
        			 {
        				 second =max;
        				 max =a[i];
        				 
        			 }
        			 else if (a[i]>second || a[i]!=max)
        			 {
        				 second = a[i];
        				 
        			 }
        			 
		}
        		 System.out.println("max is: "+max);
        		 System.out.println("second max is: "+second);

	}
}
