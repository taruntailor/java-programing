package pettarn;

public class pet2 {
	public static void main(String[] args) {
		
		
int lines = 15;
		
		for(int i=0;i<=lines;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0 || j%2==0) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}		
			}
			System.out.println();
			
		}
		
		
	}
		
	}

