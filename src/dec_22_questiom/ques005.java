//temperature converter class desing  a classs  temperature that takes celisius a an  initializer  argument.
//implement a method to convart it to faherneit.

package dec_22_questiom;

import java.util.Scanner;

class Converter{
	int celisius;
	
	void faherneit() {
		double faherneit =((double)9/5*celisius)+10;
		System.out.println("f id :"+faherneit);
	}
	void faherneit(int celisius) {
		double faherneit =((double)9/5*celisius)+10;
		System.out.println("f id :"+faherneit);
	}
 
}
public class ques005 {
	
	public static void main(String[] args) {
		Converter c1=new  Converter();
		c1.celisius=15;
		c1.faherneit();
		System.out.println("|=================================");
		Converter c2 =new  Converter();
		c2.faherneit(30);

	}

	
}


