package inheritance;
class Parent {

	protected int a;

	Parent(int a) {
		this.a = a;
	}

}

class Child extends Parent {

	private int b;

	Child(int a, int b) {
		super(a);			// here, super() is used to invoke parent class constructor
		this.b = b;
	}
	
	
	void sum() {
		System.out.println("sum : "+(a+b));
	}

}
  

public class inheritWithContructor {

	public static void main(String[] args) {

		Child ob = new Child(45, 67);
		ob.sum();
	
	}

}
