//• Write a program in Java to make such a pattern like right angle triangle with
//number increased by 1 The pattern like: 

package modal_1;

public class ques_6 {
	public static void main(String[] args) {
		int lines=1;
		
		for (int i=0;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(i++ +"");
			}
			System.out.println(" ");

		}
		
		
	}

}
