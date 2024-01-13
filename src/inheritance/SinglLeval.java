package inheritance;
class Parson{
	
	int empid;
	String name;
}
class Employee extends Parson{
	String department;
	 double salary;
	public int empId;
	 
	 
	 void SeatData(int empid,String name,String departmen,double salary) {
		 super.empid=empid;
		 super.name=name;
		 this.department=departmen;
		 this.salary=salary;
		 
	 }
	
	 void display()
		{
			System.out.println("name : "+name+"  "+"empId : "+empid+"  "+"department : "+department);
		}
		
}
public class SinglLeval {

	public static void main(String[] args) {
		
		// creating object of an employee class
		Employee emp1 = new Employee();
		emp1.empId = 111;
		emp1.name = "Tarun";
		emp1.salary = 45555.0;
		emp1.department = "IT";
		
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.SeatData(444, "Chintan", "HR", 344444.0);
		emp2.display();
		
	}

}
