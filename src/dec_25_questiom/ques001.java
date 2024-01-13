package dec_25_questiom;

//Create a circle class : write a class named circle with an initializar that takes the
//redius as an argument. implement a  method  to calculate the area of the circle. 


class Circle {
	double r;
	
	// Constructor with no parameter (default constructor )
	Circle(){
			System.out.println("No parameter constructor called");
		}

		// Parameterized constructor
	Circle(double r){
		double arew_b =3.14*r*r;
		System.out.println("area 2 : "+ arew_b);		
			
		}
		
}

public class ques001 {
	public static void main(String[] args) {
	System.out.println("=========constructor call=============");
		Circle c1 = new Circle(30);
		
}
}
