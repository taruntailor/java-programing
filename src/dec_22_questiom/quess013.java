//simple calculetar class: design a calculetar class ethod to perform basic arithmetic opertion like 
//add subtract,multiply and  divid

package dec_22_questiom;
class calculet{
	int a;
	 int b;
	 
	  void cal(){
		 System.out.println("addition :"+(a+b));
		 System.out.println("subctation :"+(a-b));
		 System.out.println("multipliction :"+(a/b));
		 System.out.println("addition :"+(a*b));
	 }
	  void cal(int a, int b){
			 System.out.println("addition :"+(a+b));
			 System.out.println("subctation :"+(a-b));
			 System.out.println("multipliction :"+(a/b));
			 System.out.println("addition :"+(a*b));
		 }
		  
	  
}
public class quess013 {
	public static void main(String[] args) {
		calculet c1= new calculet();
		c1.a=500;
		c1.b=500;
		c1.cal();
		System.out.println("======================");
		calculet c2= new calculet();
		c2.cal(10, 15);

	}

	 

}
