package inheritance;


class A{
	
	final String message = "Welcome to Tops Technologies";
	
	final void showMessage() {
		System.out.println(message);
	}
	
	

}
class Student {

	int roll;
	String name;
	String course;
	static String collegeName = "Tops Technologies";

	public Student(int roll, String name, String course) {

		this.roll = roll;
		this.name = name;
		this.course = course;

	}

	static void showCollegeName() {
		System.out.println("College Name : " + collegeName);
	}

	void show() {
		System.out.println("roll : " + roll);
		System.out.println("name : " + name);
		System.out.println("course : " + course);
		// System.out.println("college : "+collegeName);
	}

}

public class javaKeyword {

	/*
	 * void showMessage() { System.out.println("Main class method called"); }
	 */
	
	public static void main(String[] args) {
		
		A obj = new A();
		// obj.message = "xyzz";
		System.out.println(obj.message );
		
		Student s1 = new Student(22, "Tarun", "Flutter");
		s1.show();
		System.out.println("College Name : "+ Student.collegeName);
		
		Student.showCollegeName();
		
	}
	
}


