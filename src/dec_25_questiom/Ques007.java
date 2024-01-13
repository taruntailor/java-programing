package dec_25_questiom;
class Rectangle {

	double height;
	double width;
	double area;

	 Rectangle() {
		double area;
		area = this.height * this.width;
		System.out.println("Area of rectangle is : " + area);
	}

	 Rectangle(double height, double width) {
		area = this.height = height;
		area = this.width = width;

		area = height * width;
		System.out.println("your area :" + area);
	}

}
public class Ques007 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 5);
	}

}
