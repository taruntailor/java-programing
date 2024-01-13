//bank account  class: a bankaccount class with an account number and balance. 
//include a method to deposit moneY INTO  

package dec_25_questiom;

import java.util.Scanner;

class Account{
	
	String accNo;
	double balance;
	
	Account(){
		System.out.println("No parameter constructor called");
	}
	
	
	Account(double amount) {
		balance+=amount;
	}
	
	 void Display(){
		System.out.println("Account balance : "+balance);
	}
}	


public class Ques003 {
	public static void main(String[] args) {
	
	
		Account a3 = new Account(5000);
		Account a4 = new Account(155 + 255);
		a4.Display();


		
				
	}

}
