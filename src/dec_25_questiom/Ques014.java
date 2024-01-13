package dec_25_questiom;

import dec_25_questiom.employee;

class employee{
    int employeeId;
    String employeeName;
    double salary;
    double netSalary;
    
     employee(int employeeId,String employeeName,double salary ,double netSalary ) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.netSalary = netSalary;

		System.out.println(" employeeId is :" + employeeId + "\n " + "your employeeName is :" + employeeName+
				" salary is :" + salary + "\n " + "your netSalary is :" + netSalary*7);
	}
     employee() {
   		System.out.println(" employeeId is :" + employeeId + "\n " + "your employeeName is :" + employeeName+
	 				"\n"+" salary is :" + salary + "\n " + "your netSalary is :" + netSalary*7);

    }
}

public class Ques014 {
	public static void main(String[] args) {
		
		employee e2 = new employee(01, "rohan", 650, 650*7);

	}

}
