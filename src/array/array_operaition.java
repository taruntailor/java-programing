package array;

public class array_operaition {
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int sum =0;
		
		 for(int i=0; i<a.length;i++)
		 {
			    sum = sum + a[i];

		 }
		 
		 System.out.println("sum:"+sum);
		 System.out.println("avg:"+(sum/a.length));
		 
		 
		 
		 
		 System.out.println("********************************************");
		 
		 
		 
		 int max = a[0];
		 int min = a[0];
		 
		 for(int i=0; i<a.length;i++) {
			 if(a[i]>max) {
				 
				 max = a[i];
			 }
			 if(a[i]<max) {
				 min = a[i];
			 }
		 }
		 
		 System.out.println("max is:"+max);
		 System.out.println("min is :"+min);
		 
		 
		 
		 
	}
	
	

}
