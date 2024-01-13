package dec_25_questiom;

//student class whith greading method: define a student class with name  and age attributes.  add a methode

//that  assigns a gread to the student based on score input

import java.lang.reflect.Constructor;

class Student {

	String name;
	String gender;
	char grade;

	Student(){
		System.out.println("No parameter constructor called");
	}
	Student( String name, String gender){
		this.name = name;
		this.gender = gender;
		this.grade=grade;
	}

	 Student(int percent) {
		if (percent > 90) {
			grade = 'a';
		} else if (percent > 70) {
			grade = 'b';
		} else if (percent > 50) {
			grade = 'c';
		} else if (percent > 40) {
			grade = 'd';
		} else {
			System.out.println("fail");
		}

	}
	void display() {
		System.out.println("name:"+name+"\n"+" Gender:"+gender+"\n"+"grade:"+grade);
	}

}

public class Ques002 {

	public static void main(String[] args) {
		
		Student s3 = new Student("Reena", "male" );
		s3.display();
		
		Student s4 = new Student(50);
        s4.display();

}}
