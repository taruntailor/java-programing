/*Print the sum, difference and product of two complex numbers
by creating a class named 'Complex' with separate methods
for each operation whose real and imaginary parts are entered
by user*/
package modal_2;

import java.lang.reflect.Method;
import java.util.Scanner;

class Complex {
	double real;
	double imaginary;

	Complex(double real, double Complex) {
		this.real = real;
		this.imaginary = imaginary;
	}

	Complex add(Complex other) {
		double Sreal = this.real + other.real;
		double Simaginary = this.imaginary + other.imaginary;
		return new Complex(Simaginary, Sreal);

	}

	public Complex subtract(Complex other) {
		double diffReal = this.real - other.real;
		double diffImaginary = this.imaginary - other.imaginary;
		return new Complex(diffReal, diffImaginary);
	}

	public void display() {
		System.out.println("Result: " + this.real + " + " + this.imaginary + "i");
	}

	public Complex multiply(Complex complex2) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Ques014 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first complex number:");
		System.out.print("Real part: ");
		double real1 = scanner.nextDouble();
		System.out.print("Imaginary part: ");
		double imaginary2 = scanner.nextDouble();

		Complex complex1 = new Complex(real1, imaginary2);
		Complex complex2 = new Complex(real1, imaginary2);

		Complex sumResult = complex1.add(complex2);
		System.out.print("Sum: ");
		sumResult.display();

		Complex diffResult = complex1.subtract(complex2);
		System.out.print("Difference: ");
		diffResult.display();

		Complex prodResult = complex1.multiply(complex2);
		System.out.print("Product: ");
		prodResult.display();

	}

}
