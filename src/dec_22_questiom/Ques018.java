/*class room with enrollment method: desing a classroom class with a capacity attibute implement
 * a method to enroll a student if there is available space. 
 * */
package dec_22_questiom;
class ClassRoom {
	
	int avelibleNumber =(int)(Math.random()*100);
	int enrollnumber;
	
	void SeatData(){
		this.enrollnumber=enrollnumber;
		}

	void SeatData(int enrollnumber  ){
		this.enrollnumber=enrollnumber;
		}
	
	void Display() {
		if(avelibleNumber==enrollnumber) {
			System.out.println("enrollnumber :"+enrollnumber+"avelible speace you enroll");
		}
		else {
			System.out.println("enrollnumber :"+enrollnumber+"not avelible speace you enroll");

		}
	}
}

public class Ques018 {
	public static void main(String[] args) {
		ClassRoom c1 = new ClassRoom();
		c1.enrollnumber=(556);
		c1.Display();
		ClassRoom c2 = new ClassRoom();
		c2.SeatData(52);
		c2.Display();
	}

}
