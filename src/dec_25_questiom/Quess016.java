////garden part watering system: implement aplant class with a species name and waterting frecuency.
//include  a method to display the next wartering date 
package dec_25_questiom;
class Plant{
	String frecuency;
	String species;
	
	
	Plant() {
		this.frecuency=frecuency;
		this.species=species;
	}
	Plant(String frecuency,String species) {
		this.frecuency=frecuency;
		this.species=species;
	}
	void Display() {
		System.out.println("plant name :"+species+"\n"+"watering :"+frecuency);
	}
}
public class Quess016 {
public static void main(String[] args) {
	Plant p1 = new Plant("rose", "8:00 to 9:00");
	p1.Display();
	
}
}
