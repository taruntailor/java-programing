//Write a Java program that takes the user to provide a single character from
//the alphabet. Print Vowel or Consonant, depending on the user input. If the
//user input is not a letter (between a & z or A and Z), or is a string of length
//> 1, print an error message. 
package modal_1;

import java.util.Scanner;

public class ques_2 {
	
	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any charecter");
		ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vowel valu");
		}
		else {
			System.out.println("Consonant");
		}

	}

}
