package oops;

class student{
	 int id;
	 String name;
	 student()
		{
			System.out.println("construcot calling");
		}
	 student(int a)
		{
			System.out.println("number is : "+a);
		}
	 student(String  name){
			System.out.println("number is : "+name);

	 }
	student(int id, String name)
		{
			this.id = id;
			this.name = name;
		}
		
	 public void print()
		{
			System.out.println(id+" "+name);
		}
	
}
public class constructor {
	public static void main(String[] args) {
		
		student st1 = new student();
		student st2 = new student(10);
		student st3 = new student("ronny");
		
		student st4 = new student(10,"Darhsak");
		st4.print();
		

		

		
	}

}
