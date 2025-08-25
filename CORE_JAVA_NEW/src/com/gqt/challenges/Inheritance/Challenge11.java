package com.gqt.challenges.Inheritance;
class BankAccount{
	long accno;
	int balance;
}
class savingsAccount extends BankAccount{
	void display() {
		System.out.println("account = "+ accno + " balance = "+balance);
	}
}
class currentAccount extends BankAccount{
	void display() {
		System.out.println("account = "+ accno + " balance = "+balance);
	}
}
public class Challenge11 {
public static void main(String[] args) {
	savingsAccount sa = new savingsAccount();
	sa.accno=987636468;
	sa.balance=2300;
	sa.display();
	currentAccount ca = new currentAccount();
	ca.accno=87953490;
	ca.balance=1900;
	ca.display();
}
}
