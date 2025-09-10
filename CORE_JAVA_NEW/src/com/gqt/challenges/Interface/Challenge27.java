package com.gqt.challenges.Interface;
interface writable{
	void write();
}
interface readable{
	void read();
}
class file1 implements writable , readable{
	@Override
	public void write() {
    System.out.println(" written in file");
	}@Override
	public void read() {
     System.out.println(" read file ");
	}
}
class database1 implements readable , writable{
	@Override
	public void write() {
    System.out.println(" written in file");
	}@Override
	public void read() {
     System.out.println(" read file ");
	}}

public class Challenge27 {
public static void main(String[] args) {
	file1 f = new file1();
	f.write();
	f.read();
	database1 db = new database1();
	db.write();
	db.read();		
}
}
