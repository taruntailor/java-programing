//Write a program in Java to make such a pattern like right angle triangle with
//number increased by 1 The pattern like: 
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 

package modal1;

public class pet2 {

	
	public static void main(String[] args) {
		 int a = 1;
	        for (int i = 0; i <= 4; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(a++ + " ");
	            }
	            System.out.println();
	        }
	}
}

