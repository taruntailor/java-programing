//Rectangle class with area calculation write a rectangle  class with height and width as attributes. 
//add a method to calculate the area. 

package dec_22_questiom;

class Rectangle {

	double height;
	double width;
	double area;

	void Area() {
		double area;
		area = this.height * this.width;
		System.out.println("Area of rectangle is : " + area);
	}

	void Area1(double h, double w) {
		area = this.height = h;
		area = this.width = w;

		area = height * width;
		System.out.println("your area :" + area);
	}

}

public class Quees007 {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.height = 30;
		r1.width = 21;
		r1.Area();

		Rectangle r2 = new Rectangle();
		r2.Area1(30, 19);

	}

}
