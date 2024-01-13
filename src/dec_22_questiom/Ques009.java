//Grocery iteam with class prie calculation:  define a grocery iteam class with name and price per unit. 
//impoliment method to calculet the total price baesd on qunetity

package dec_22_questiom;
class Iteam{
	
	String name;
	Double price;
	int quntity;
	double total;

	void SeatIteam() {
		System.out.println("ites name :"+name+"\n"+"iteam price :"+price+"\n"+
	"quntity"+quntity+"\n"+"total:"+total);
	}
	void SeatIteam(String name, double price , int quntity, double total) {
		System.out.println("ites name :"+name+"\n"+"iteam price :"+price
				+"\n"+"quntity"+quntity+"\n"+"total:"+total);
	}

}
public class Ques009 {
	private static final int Quntity = 0;

	public static void main(String[] args) {
		
		Iteam i1 = new Iteam();
		i1.name="rice";
		i1.price= (double) 50;
		i1.quntity=4;
		i1. total=4*50;
		i1.SeatIteam();
		
		System.out.println("===================================");
		
		Iteam i2 = new Iteam();
		i2.SeatIteam("tea", (double) 350,3,350*3);


	}

}
