package inheritance;

class Account {

	String accno;
	double balance;

	void  Deposit(Double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("invalid amount");
		}
	}
	void withdorw(double amount) {
		if (amount>0) {
			if (amount<=amount) {
				balance-=amount;
			}else {
				System.out.println("insuffecient account balance");

			}
			
		}else {
			System.out.println("invalid amount");
		}
		
	}
	void Display(String type) {
		System.out.println("Account balance after transaction (" + type + ") : " + balance);

	}
}

class Savingaccount extends Account {
	double intrestRate = 6;
	public String accNo;

	double getInterestAmount() {
		return balance * intrestRate / 100;
	}

}

class CurrentAccount extends Savingaccount {


}

public class Hierarichalcal {
	public static void main(String[] args) {
		Savingaccount ob1 = new Savingaccount();
		ob1.accNo = "1111";
		ob1.balance = 10000;

		ob1.Deposit((double) -500);
		ob1.withdorw(45500);
		ob1.Deposit((double) 200);
		
		System.out.println("interest amount : "+ob1.getInterestAmount());

		CurrentAccount ob2 = new CurrentAccount();
		ob2.accNo = "2222";
		ob2.balance = 5000;
		
	}

}
