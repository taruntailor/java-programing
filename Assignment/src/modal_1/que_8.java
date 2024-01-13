//Write a Java program to count the letters, spaces, numbers and other
//characters of an input string. 

package modal_1;

import java.util.Scanner;

public class que_8 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("enter your string value");
   String str = sc.nextLine();
   
   valuefind(str);
}

static void valuefind(String t) {
        
	 char []c = t.toCharArray();
	 int letter=0,space=0,number=0,symbol=0;
	 
	 for(int i=0; i<t.length();i++) {
		 
		 if(Character.isLetter(c[i])) 
			 letter++;
		 else if (Character.isSpaceChar(c[i])) 
			 space++;
		 else if (Character.isDigit(c[i])) 
			 number++;
		 else 
			 
			 symbol++;
	 }
	 System.out.println("letter: " + letter + "\n" + "spaces: " + space + "\n" + "number: " + number + "\n" + "symbol: " + symbol);

 }
}
