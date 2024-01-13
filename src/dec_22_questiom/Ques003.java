//bank account  class: a bankaccount class with an account number and balance. 
//include a method to deposit moneY INTO  

package dec_22_questiom;

import java.util.Scanner;

class Account{
	
	String accNo;
	double balance;
	
	void deposit(double amount) {
		balance+=amount;
	}
	
	void showBalance() {
		System.out.println("Account balance : "+balance);
	}
}

class BankAccount{
	double accountNumber;
	double depositMoney;
	double withDrawal;
	double totalBalance;
	public int balance;
	
	void myData(double a, double d, double w, double t) {
		accountNumber = a;
		depositMoney = d;
		withDrawal = w;
		totalBalance = t;		
	}
	void totalBalance() {

		totalBalance = depositMoney - withDrawal;
		System.out.println("Ur account total balace is : " + totalBalance);

	}

	
	
}

public class Ques003 {
	public static void main(String[] args) {
	
		Account a1 = new Account();
		a1.accNo = "111111";
		a1.balance = 5000;
		a1.showBalance();
		a1.deposit(409);
		a1.showBalance();
		
		BankAccount b1 = new BankAccount();
		b1.accountNumber = 225858;
		b1.withDrawal = 58000;
		b1.depositMoney = 60000;
		b1.totalBalance();
		
		BankAccount b2 = new BankAccount();
		b2.myData(00000011, 55, 25, 0);
		b2.totalBalance();
		
		

		
		
	}

}
