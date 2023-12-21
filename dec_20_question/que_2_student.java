package dec_20_question;

import java.util.Scanner;

class student {

	int Class;
	int age;
	String name;
	String lastname;

	public void std() {


		System.out.println("class : " + Class + "\n" + "age : " + age + "\n" + "name : " + name + "\n" + "lastname : " + lastname);
			
	}

}

public class que_2_student {

	public static void main(String[] args) {
		
		
		student a1 = new student();
		
		a1.age=20;
		a1.Class=12;
		a1.name="ronny";
		a1.lastname="tailor";
		a1.std();


	}

}
