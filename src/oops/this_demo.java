package oops;
class demo{
	
	int id=20;
	
	public void display() {
		
		int id =50;
		System.out.println(id);
		System.out.println(this.id);
		
	}
}
public class this_demo {

	public static void main(String[] args) {
		demo d = new demo();
		d.display();
		
	}
}
