
package com.gqt.challenges.Abstraction;
abstract class Bank{
	abstract void openAccount();
	abstract void closeAccount();
}
class savingBank extends Bank{
	public savingBank() {
		System.out.println("Saving Bank");
	}
	@Override
	void openAccount() {
		System.out.println("In savingBank Account has opened");
	}
	@Override
	void closeAccount() {
		System.out.println("Account has closed in Saving Bank"); 
	}
}
class currentBank extends Bank{
	public currentBank() {
		System.out.println("Current Bank");
	}
	@Override
	void openAccount() {
		System.out.println("In currentBank Account has opened");
	}
	@Override
	void closeAccount() {
		System.out.println("Account has closed in current Bank"); 
	}
}
public class Challenge13 {
public static void main(String[] args) {
savingBank sb = new savingBank();
sb.openAccount();
sb.closeAccount();
currentBank cb = new currentBank();
cb.openAccount();
cb.closeAccount();
}
}
