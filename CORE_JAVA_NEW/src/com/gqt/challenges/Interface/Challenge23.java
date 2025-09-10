package com.gqt.challenges.Interface;
interface sendable{
	void send();
}
interface receivable{
	void receive();
}
class transmitter implements sendable{
	@Override
	public void send() {
	 System.out.println("Message sent");
	}
}
class receiver implements receivable{
	@Override
	public void receive() {
	 System.out.println("Message receiveed");
	}
}
public class Challenge23 {
public static void main(String[] args) {
	transmitter t = new transmitter();
	t.send();
	receiver r = new receiver();
	r.receive();
}
}
