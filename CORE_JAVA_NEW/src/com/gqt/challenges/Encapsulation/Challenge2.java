package com.gqt.challenges.Encapsulation;
class Yannam{
	private int family_cnt;
	private String Father;
	private String Mother;
	
	public void getdetails(int family_cnt , String Father , String Mother){
		this.family_cnt=family_cnt;
		this.Father=Father;
		this.Mother=Mother;
		System.out.println(family_cnt);
		System.out.println(Father);
		System.out.println(Mother);
	}
}
public class Challenge2 {
public static void main(String[] args) {
	Yannam obj = new Yannam();
	obj.getdetails(5, "ravi", "ramani");
}
}
