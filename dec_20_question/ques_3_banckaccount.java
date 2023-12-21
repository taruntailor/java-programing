package dec_20_question;

import java.lang.reflect.Method;

class banck {

	String account_no;
	double balnce;

	void BankAccount(String account_no, double balnce) {

		account_no = account_no;
		balnce = balnce;
	}

	String account_no() {

		return account_no;

	}

	double balncce() {

		return balnce;

	}
	
	public void deposit(double amount) {
		if(amount<0) {
			balnce+=amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balnce);
		}
		else {
            System.out.println("Invalid deposit amount. Please deposit a positive amount.");

		}
		
	}

}

public class ques_3_banckaccount {
public static void main(String[] args) {
	
banck a1 = new banck();
a1.deposit(12222);
}
	

}
