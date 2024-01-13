//employee class with salary calculation: creat an emplyee class with name and hourly wage. add method to 
//calculate weekly salary based on  hours workde

package dec_22_questiom;

class employee{
	     int employeeId;
	     String employeeName;
	     double salary;
	     double netSalary;
	     
	     void setEmployee(int employeeId,String employeeName,double salary ,double netSalary ) {
	 		this.employeeId = employeeId;
	 		this.employeeName = employeeName;
	 		this.salary = salary;
	 		this.netSalary = netSalary;

	 		System.out.println(" employeeId is :" + employeeId + "\n " + "your employeeName is :" + employeeName+
	 				" salary is :" + salary + "\n " + "your netSalary is :" + netSalary*7);
	 	}
	     void setEmployee() {
	    		System.out.println(" employeeId is :" + employeeId + "\n " + "your employeeName is :" + employeeName+
		 				"\n"+" salary is :" + salary + "\n " + "your netSalary is :" + netSalary*7);

	     }
}

public class ques014 {
	public static void main(String[] args) {
		employee e1 = new employee();
		e1.employeeName="rohan";
		e1.employeeId=01;
		e1.salary=5000;
		e1.netSalary=5000;
		e1.setEmployee();
		System.out.println("===================");
		employee e2 = new employee();
		e2.setEmployee(02, "khishor", 1000, 1000);

	}

}
