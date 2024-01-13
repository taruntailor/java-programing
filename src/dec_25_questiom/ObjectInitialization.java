package dec_25_questiom;
class StudentClass{
	
	int roll;
	String name;
	String course;
	
	// Constructor with no parameter (default constructor )
	StudentClass(){
		System.out.println("No parameter constructor called");
	}
	
	// Parameterized constructor
	StudentClass(int roll, String name, String course){
		this.name = name;
		this.roll = roll;
		this.course = course;
	}
	
	StudentClass(String name){
		this.name = name;
	}
	
	void setData(int roll, String name, String course) {
		this.name = name;
		this.roll = roll;
		this.course = course;
	}
	
	void display() {
		System.out.println("name : "+name+", course : "+course);
	}
	
}


public class ObjectInitialization {

	
	public static void main(String[] args) {
	
		// object initialization by reference 
		StudentClass s1 = new StudentClass();		// here, StudentClass() is a constructor with no arguments 
		s1.roll = 21;
		s1.name = "Rahul";
		s1.course = "Java";
		
		s1.display();
		
		// object initialization by method
		StudentClass s2 = new StudentClass();
		s2.setData(55, "Ajay", "Python");
		s2.display();
		
		// object initialization by constructor
		StudentClass s3 = new StudentClass(34, "Reena", "Android");
		s3.display();
		
		StudentClass s4 = new StudentClass("Manoj");
		s4.display();
		
	}
}
