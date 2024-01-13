package logical;

public class armstrong {
	public static void main(String[]args) {
		
		int num =123;
		int temp =num;
		int sum =0;
		
		
		while (num!=0) {
			 int rem = num % 10;
			 sum =sum +(rem*rem*rem);
			 num= num/10;
		}
		
		if(temp == sum) {
			
			System.out.println("Armstrong");

		}
		else {
			System.out.println("not armstrong");

		}
	}

}
