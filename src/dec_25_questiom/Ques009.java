package dec_25_questiom;
class Iteam{
	
	String name;
	Double price;
	int quntity;
	 double total;


	 Iteam() {
		System.out.println("ites name :"+name+"\n"+"iteam price :"+price
					+"\n"+"quntity"+quntity+"\n"+"total:"+total);
	}
   Iteam(String name, double price , int quntity, double total) {
	   System.out.println("ites name :"+name+"\n"+"iteam price :"+price
				+"\n"+"quntity"+quntity+"\n"+"total:"+total);
	}

}
public class Ques009 {

	public static void main(String[] args) {
		Iteam i1 = new  Iteam("tea", (double) 350,3,350*5);
	}
}
