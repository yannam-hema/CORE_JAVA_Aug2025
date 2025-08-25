package com.gqt.challenges.Abstraction;
abstract class BankAccount{
	abstract void deposit();
	abstract void withdraw();
}
class savingAccount extends BankAccount{
	public savingAccount() {
		System.out.println("Saving's Account");
	}
	@Override
	void deposit() {
		System.out.println("Amount deposit in saving's Account");
	}
	@Override
	void withdraw() {
		System.out.println("Amount withdrwan from saving's Account"); 
	}
}
class CurrentAccount extends BankAccount{
	public CurrentAccount() {
		System.out.println("Current Account");
	}
	@Override
	void deposit() {
		System.out.println("Amount deposit in current Account");
	}
	@Override
	void withdraw() {
		System.out.println("Amount withdrwan from current Account"); 
	}
}
public class Challenge7 {
public static void main(String[] args) {
savingAccount sa = new savingAccount();
sa.deposit();
sa.withdraw();
CurrentAccount ca = new CurrentAccount();
ca.deposit();
ca.withdraw();
}
}
