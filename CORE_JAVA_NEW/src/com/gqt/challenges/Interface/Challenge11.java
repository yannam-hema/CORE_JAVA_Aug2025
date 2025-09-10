package com.gqt.challenges.Interface;
interface sortable{
	void sort();
}
interface searchable{
	void search();
}
class list1 implements sortable,searchable{
@Override
public void sort() {
	System.out.println("List elements is sorted");
}@Override
	public void search() {
    System.out.println("Element is found in list");
	}	
}
class dictionary implements sortable,searchable{
@Override
public void sort() {
	System.out.println("Dictionary elements is sorted");
}@Override
	public void search() {
    System.out.println("Element is not found in dictionary");
	}	
}
public class Challenge11 {
public static void main(String[] args) {
	list1 l = new list1();
	dictionary d = new dictionary();
	l.sort();
	l.search();
	d.search();
	d.sort();
}
}
