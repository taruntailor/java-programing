// Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5
//5 + 55 + 555 

package modal_1;

import java.util.Scanner;

public class que_10 {
	public static void main(String[] args) {
		
		int n;
		Scanner str = new Scanner(System.in);
     	System.out.print("enter inpute your value :");
		n = str.nextInt();		
		
		System.out.printf("%d+ %d%d+ %d%d%d\n"+ n,n,n,n,n,n);
		
	
		
	}

}
