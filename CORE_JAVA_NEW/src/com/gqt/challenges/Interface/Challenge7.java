package com.gqt.challenges.Interface;

interface set{
	void add();
	void remove();
	boolean contains();
}
interface list{
	void add();
	void remove();
	boolean contains();
}
class arrayList implements list {
	@Override
	public void add() {
		System.out.println("Added ele in arraylist");
		
	}@Override
	public void remove() {
		System.out.println("removed ele in arraylist");
		
	}@Override
	public boolean contains() {
		return false;
	}	
}
class hashSet implements set {
	@Override
	public void add() {
		System.out.println("added ele in hashset");
		
	}@Override
	public void remove() {
		System.out.println("removed ele in hashset");
		
	}@Override
	public boolean contains() {
		return true;
	}
}

public class Challenge7 {
public static void main(String[] args) {
	arrayList al = new arrayList();
	al.add();
	al.remove();
	al.contains();
	hashSet hs = new hashSet();
	hs.add();
	hs.remove();
	hs.contains();
}
}
