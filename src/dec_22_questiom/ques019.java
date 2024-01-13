/*pet class with feeding schedule : write a pet classs with a name and species. 
 *  include  a method to display the feeding  schedule 
 */
package dec_22_questiom;

class Pet {

	String name;
	String species;

	void setdata(String name, String species) {
		this.name = name;
		this.species = species;
	}

	void showDetail() {
		System.out.println("name : " + name + "\n" + "species : " + species);
	}

	void showFeedingSchedule() {
		if (species.equals("Cat")) {
			System.out.println(name + "(feeding schedule) : " + "7.00 PM to 9.00 PM");
		} else if (species.equals("Dog")) {
			System.out.println(name + "(feeding schedule) : " + "9.00 PM to 11.00 PM");
		}

	}

}

public class ques019 {
	public static void main(String[] args) {

		Pet p1 = new Pet();
		p1.setdata("Tom", "Cat");
		p1.showDetail();
		p1.showFeedingSchedule();

		Pet p2 = new Pet();
		p2.setdata("Jerry", "Dog");
		p2.showFeedingSchedule();
	}

}
