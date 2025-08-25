package com.gqt.challenges.Encapsulation;
class Book{
	private String title;
	private String author;
	private int price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class Challenge7 {
public static void main(String[] args) {
Book b= new Book();
b.setAuthor("Chitra Benerjee");
b.setTitle("The palace of illusions");
b.setPrice(500);
System.out.println(b.getAuthor());
System.out.println(b.getTitle());
System.out.println(b.getPrice());
}
}
