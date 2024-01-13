package javaString;
/*
String => sequence of characters. or character array    
*/

public class javaString {
	public static void main(String[] args) {

		// creating object using string literals

		String name = "raj"; // its created object of String class
		String lastname = "singh";

		// creating object using new keyword
		String state = new String("gujrat");

		name += lastname;

		System.out.println(name);
		System.out.println(state);

// String propertys use =

//============================================================================================				

		// lenght property example =>

		System.out.println("lenght of string :" + lastname.length());
//===========================================================================================
		// upper case and lower case
		System.out.println("use uppercase :" + name.toUpperCase());
		System.out.println("use lowercase :" + name.toLowerCase());

//===========================================================================================
		// equals and equals ignore case

		String st1 = "10", st2 = "tops";

		System.out.println("equal :" + st1.equals(st2));
		if (st1.equals(st2)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are different");
			
		}
//=============================================================================================
		
        //trim property use =>
		String t1 = "TOPS  ";
		System.out.println("trim case :"+t1.length());
		System.out.println("trim case :"+t1.trim().length());
//==============================================================================================
		//equals ignore property use =>
		System.out.println();
		System.out.println("equals ignore case : " + st1.equalsIgnoreCase(st1.trim()));

//==================================================================================================
		//char at property use =>
		// char at - getting character based on index
        String Sname="rajasthan";
		System.out.println("character at index 5 : " + Sname.charAt(5));
		// iterate string one by one 
				  for(int i = 0; i<Sname.length(); i++) {
				  		System.out.println(Sname.charAt(i));
				  }
//====================================================================================================
					// indexOf - getting index based on character 
                 System.out.println("index of case n :"+Sname.indexOf("N".toLowerCase()));
         		System.out.println("index of t : "+Sname.indexOf("T", Sname.indexOf("T")+1));
//====================================================================================================
        		// lastIndexOf
             System.out.println("Last index of case n"+Sname.lastIndexOf("n"));
             
//=======================================================================================================
     		// replace property use 
              System.out.println("replace property :"+Sname.replace("rajasthan","gujrat"));
//=======================================================================================================              
	}

	

}
