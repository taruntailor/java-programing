package statment;

import java.util.Scanner;

public class calutor {
	public static void main(String[]args) {
		
		int chocice = 0;
		
		do {
			Scanner src= new Scanner(System.in);
			int a,b;
			
			System.out.println("enter your value a and b:");
			a = src.nextInt();
			b = src.nextInt();
			
			System.out.println("choice your num \n (1) add \n (2) sub \n (3) multi \n (4) divi \n (0) Exit your choice");
			chocice = src.nextInt();
			
			switch (chocice) {
			case 1:
				System.out.println("add is " + (a + b));
				break;
				
			case 2:
				System.out.println("sub is " + (a - b));
				break;
				
			case 3:
				System.out.println("multi is " + (a * b));
				break;
			case 4:
				System.out.println("divi is " + (a / b));
				break;
			case  0:
				System.out.println("Exit");
				break;
			default:
				System.out.println("enter your vailid choice");
			}
		
		}while(chocice !=0);
}
}
