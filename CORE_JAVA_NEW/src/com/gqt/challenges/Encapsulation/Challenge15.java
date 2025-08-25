package com.gqt.challenges.Encapsulation;

class Mobile{
	private String brand;
	private String model;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class Challenge15 {
public static void main(String[] args) {
Mobile m= new Mobile();
m.setBrand("Apple");
m.setModel("16 pro max");
m.setPrice(1000000);
System.out.println(m.getBrand());
System.out.println(m.getModel());
System.out.println(m.getPrice());
}
}
