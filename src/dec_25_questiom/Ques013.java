package dec_25_questiom;

class calculet {
	int a;
	int b;

	calculet() {
		System.out.println("addition :" + (a + b));
		System.out.println("subctation :" + (a - b));
		System.out.println("multipliction :" + (a / b));
		System.out.println("addition :" + (a * b));
	}

	calculet(int a, int b) {
		System.out.println("addition :" + (a + b));
		System.out.println("subctation :" + (a - b));
		System.out.println("multipliction :" + (a / b));
		System.out.println("addition :" + (a * b));
	}

}

public class Ques013 {
	public static void main(String[] args) {
		calculet c1=new calculet(15, 15);
	}

}
