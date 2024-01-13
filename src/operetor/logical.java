package operetor;

public class logical {
public static void main(String[] args) {
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("******************");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("*********************");
		
		int a = 20;
		int b = 30;
		int c = 20;
		
		
		//System.out.println(a>b || a==c);
		System.out.println(c>b && a<b);
	}

}
