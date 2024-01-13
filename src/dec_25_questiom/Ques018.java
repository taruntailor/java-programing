/*class room with enrollment method: desing a classroom class with a capacity attibute implement
 * a method to enroll a student if there is available space. 
 * */
package dec_25_questiom;
class ClassRoom {
	
	int avelibleNumber =(int)(Math.random()*100);
	int enrollnumber;
	
	 ClassRoom(){
		this.enrollnumber=enrollnumber;
		}

	 ClassRoom(int enrollnumber  ){
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
		ClassRoom c1 = new ClassRoom(15);
		c1.Display();
	}

}
