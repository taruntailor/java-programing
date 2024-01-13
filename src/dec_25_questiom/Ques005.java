package dec_25_questiom;

class Converter{
	int celisius;
	
	Converter() {
		double faherneit =((double)9/5*celisius)+10;
		System.out.println("f id :"+faherneit);
	}
	Converter(int celisius) {
		double faherneit =((double)9/5*celisius)+10;
		System.out.println("f id :"+faherneit);
	}
 
}
public class Ques005 {
	public static void main(String[] args) {
		Converter c1 = new Converter(10);
	}

}
