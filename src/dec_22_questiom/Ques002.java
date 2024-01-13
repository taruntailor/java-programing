//student class whith greading method: define a student class with name  and age attributes.  add a methode
//that  assigns a gread to the student based on score input

package dec_22_questiom;

import java.lang.reflect.Constructor;


class Student {

	String name;
	String gender;
	int grade;
	
	Student(){
		
	}

	public Student(String name, String gender) {
		this.name=name;
		this.gender = gender;
	}
	
	void Grade(int percent) {
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

	void SateData() {
		System.out.println("name :" + name + "\n" + "gander :" + gender + "\n" + "grade :" + grade);
	}

	void SateData1(String gender, String name) {
		this.name = name;
		this.gender = gender;
		this.grade = grade;
		System.out.println("name :" + name + "\n" + "gander :" + gender + "\n" + "grade :" + grade);

	}

	
	public Student(int percent) {
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

	
}

public class Ques002 {


	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="ronny";
		s1.gender="male";
		s1.Grade(95);
		s1.SateData();
		System.out.println("===================");
		Student s2 = new Student();
		s2.Grade(95);
		s2.SateData1("ronny", "male");

		System.out.println("====call to cunstructor=================");



	}

}