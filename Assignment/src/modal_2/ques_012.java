/*Create a class named 'Rectangle' with two data members
'length' and 'breadth'and two methods to print the area and
perimeter of the rectangle respectively. Its constructor having
parameters for length and breadth is used to initializethe length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'class with
its constructor having a parameter for its side (suppose s) calling theconstructor
of its parent class as 'super (s, s)'. Print the area and perimeter of arectangle
and a square.
*/
package modal_2;
class Rectangle {
	 private double length;
	    private double breadth;
	    public Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }
	    public void calculateArea() {
	        double area = length * breadth;
	        System.out.println("Rectangle Area: " + area);
	    }
	    public void calculatePerimeter() {
	        double perimeter = 2 * (length + breadth);
	        System.out.println("Rectangle Perimeter: " + perimeter);
	    }
	    
}
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class ques_012 {
	 public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(4, 6);
	        rectangle.calculateArea();
	        rectangle.calculatePerimeter();

	        Square square = new Square(5);
	        square.calculateArea();
	        square.calculatePerimeter();
	    }

}
