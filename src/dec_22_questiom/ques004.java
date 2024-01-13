//book library system: implement a book class with attitrubs title and uthor. 
//add a method  to desplay books details  
package dec_22_questiom;
class BookLibarar{
	String name;
	String color;
	int pages;



	void setData(String name, String color, int pages) {
		this.name = name;
		this.color = color;
		this.pages = pages;

	}
	void setData(String n, int a, String e) {
		name  = n;
		color = e;
		pages = a;

	}
	void showDetails() {
		String grade = null;
		System.out.println("name is : " + name + "\n" + "color is : " + color + "\n" + "pages is : " + pages );
//		System.out.println("Student detail"); 

	}

}
public class ques004 {
	public static void main(String[] args) {
		BookLibarar s1 = new BookLibarar();
		s1.name = "web.com";
		s1.color="red";
		s1.pages=50;
		s1.showDetails();

		System.out.println("=============================");

		BookLibarar s2 = new BookLibarar();
     	s2.setData("html","black",50);
		s2.showDetails();
	}

}
