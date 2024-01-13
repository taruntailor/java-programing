//book library system: implement a book class with attitrubs title and uthor. 
//add a method  to desplay books details
package dec_25_questiom;

import dec_25_questiom.BookLibarar;

class BookLibarar{
	String name;
	String color;
	int pages;
	
	

	BookLibarar(String name, String color, int pages) {
		this.name = name;
		this.color = color;
		this.pages = pages;

	}
	void showDetails() {
		String grade = null;
		System.out.println("name is : " + name + "\n" + "color is : " + color + "\n" + "pages is : " + pages );

	}
}
public class Quess_004 {
	public static void main(String[] args) {
		
		BookLibarar s2 = new BookLibarar("html", "black", 456);
		s2.showDetails();
	}

}
