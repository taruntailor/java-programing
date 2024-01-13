package logical;

public class fectorial {

public static void main(String[] args) {
		
		int num = 5;
		int fact = 1;
//		for(int i=1;i<=num;i++)
//		{
//			fact = fact * i;
//			
//		}
		
//		while(num!=0)
//		{
//			fact = fact*num;
//			num--;
//		}
		
		int i = 1;
		
		while(i<=num)
		{
			fact = fact*i;
			i++;
			
		}
		
		
		
		System.out.println("factoria is  : "+fact);
		
		
	}

}
