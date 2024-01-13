package logical;

public class primar_number {

	public static void main(String[] ars) {
		
		for(int j=3;j<=100;j++)
		{
			int num=j;
			int flag =0;
			
			for(int i=2; j<num;j++) {
				if(num%i==0)
				{
					flag=1;
					break;
				}
				
				
			}
			
		if(flag==0) {
			System.out.println(num+ ": is prime");

		}
		else {
			System.out.println(num+ ": is vot  prime");

		}
			
		}
		
	}
}
