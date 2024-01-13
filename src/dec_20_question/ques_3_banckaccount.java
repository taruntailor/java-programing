package dec_20_question;

import java.util.Scanner;

class banck {

	double balance;
	double amont;

	public void bank() {
		balance = 1000;
	}

	void deposit() {
		Scanner src = new Scanner(System.in);
		System.out.println("entern your amont");
		amont = src.nextDouble();

		balance = balance - amont;
	}

	void balance() {
		Scanner src = new Scanner(System.in);
		System.out.println("entern your amont");
		amont = src.nextDouble();
		if (balance > 1000) {
			balance = balance - amont;
		} else {
			System.out.println("minimum balance  1000");
		}

	}

	void display() {
		System.out.println(balance);
	}
}

public class ques_3_banckaccount {
	public static void main(String[] args) {

		banck account = new banck();
		int ch = 0;
		Scanner src = new Scanner(System.in);

		do {

			System.out.println("ramesh jinagr no.1");
			System.out.println("==========================");
			System.out.println("bank accoument manegment ");
			System.out.println("menu");
			System.out.println("1.deposit");
			System.out.println("2.banlance");
			System.out.println("3.exit");
			System.out.println("enter your choice");
			ch = src.nextInt();
			switch (ch) {

			case 1:
				account.deposit();
				break;
			case 2:
				account.balance();
				break;
			case 4:
				System.exit(0);

			}

		} while (ch != 3);
	}

}
