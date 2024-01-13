package dec_20_question;

import java.util.Scanner;

class Rectangle{
	
	double height, width;
	
	void area()
	{
		System.out.println("area of rectangle : "+(height*width));
	}
	
}


public class ques_7_rectangle {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height : ");
		r1.height = sc.nextDouble();
		r1.width = sc.nextDouble();
		
		r1.area();

	}

	


}
