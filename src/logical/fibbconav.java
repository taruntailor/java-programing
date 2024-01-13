package logical;

public class fibbconav {

public static void main(String[]args) {
	
 int a=6;
 int b=9;
 int c;
 
 System.out.println(a+""+b);
 for(int i=1; i<=20; i++) {
	 
	 c=a+b;
	 System.out.println(""+c);
	 a=c;
	 b=c;
 }
	
}
}

	