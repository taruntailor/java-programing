package dec_20_question;
class book{
	
	String book_name;
	int pages;
	int mrp;
	String color;
	
	public void display () {
		  
		System.out.println("book_name : " + book_name + "\n" + "pages : " + pages + "\n" + "mrp : " + mrp + "\n" + "color : " + color);
	}
	
	
}

public class que_4_book {
public static void main(String[] args) {
	
	book a = new book();
	a.book_name="logical";
	a.pages=450;
	a.mrp=200;
	a.color="blue";
	a.display();
}
}
