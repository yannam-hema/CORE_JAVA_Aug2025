package com.gqt.challenges.Encapsulation;
class Bank{
	private long accountNumber;
	private int balance =2000;
	public void deposit(int money) {
		this.balance+=money;
		System.out.println("Rs."+ money +" Deposited Succesfully");
		System.out.println("Total balance "+balance);
	}
	
	public void withdraw() {
		System.out.println("Money has withdrawn Sucessfully! Happy Banking");
	}
}
public class Challenge3 {
	public static void main(String[] args) {
Bank b = new Bank();
   b.deposit(900);
   b.withdraw();
	}
}
