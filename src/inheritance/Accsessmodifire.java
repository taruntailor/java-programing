package inheritance;
class A{
	
	protected int num1;
	
	void showNum1() {
		
	}
	
}


class B extends A{
	
	int num2;
	
	void showNum2() {
		System.out.println(num1);
	}
	
}

public class Accsessmodifire {

	public int num3 =100;
	
	public static void main(String[] args) {
		
		B ob1 = new B();
		
		A ob2 =  new A();
		ob2.num1 = 121;
		
		System.out.println("num1 : "+(ob2.num1));
		
	}

}
