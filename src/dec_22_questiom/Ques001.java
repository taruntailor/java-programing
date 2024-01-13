//Create a circle class : write a class named circle with an initializar that takes the
//redius as an argument. implement a  method  to calculate the area of the circle. 

package dec_22_questiom;

class Circle {
	double r;
	
	double calcu1() {
		double area_a =3.14*r*r;
		System.out.println("area 1 :"+area_a);
		return area_a;
	}
	double calcu2(double r){
		double arew_b =3.14*r*r;
		System.out.println("area 2 : "+ arew_b);
		return arew_b;
		
	}
	
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

public class Ques001 {
	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.r=25;
		c1.calcu1();
		System.out.println("=============================");
		Circle c2 = new Circle();
		c2.calcu2(30);
		
		System.out.println("=========constructor all=============");
		Circle c3 = new Circle(30);
		
}
}