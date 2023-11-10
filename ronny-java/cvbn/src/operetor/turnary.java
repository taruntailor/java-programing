package operetor;

public class turnary {
public static void main(String[] args) {
		
		
		int a = 500;
		int b = 700;
		int c = 90;
		
		//String result =  a>b ? "A is greater" : "B is greater" ;
		
		String result =  a>b ? a>c ? "A is greater":"C is greater" : b>c ? "B is greater":"C is greater" ;
		
		System.out.println(result);
		
		
	}

}
