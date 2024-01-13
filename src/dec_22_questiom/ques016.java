////garden part watering system: implement aplant class with a species name and waterting frecuency.
//include  a method to display the next wartering date 


package dec_22_questiom;
class Plant{
	String frecuency;
	String species;
	
	
	void watering() {
		this.frecuency=frecuency;
		this.species=species;
	}
	void watering(String frecuency,String species) {
		this.frecuency=frecuency;
		this.species=species;
	}
	void Display() {
		System.out.println("plant name :"+species+"\n"+"watering :"+frecuency);
	}
}

public class ques016 {

	public static void main(String[] args) {
		Plant p1 = new Plant();
		p1.frecuency="6:00 to 8:00 am";
	    p1.species="rose";
	    p1.Display();
	    
	    Plant p2 = new Plant();
	    p2.watering("7:00 to 8:00", "rose");
	    p2.Display();
	    
	}
}
