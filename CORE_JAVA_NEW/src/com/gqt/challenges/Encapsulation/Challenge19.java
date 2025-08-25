package com.gqt.challenges.Encapsulation;
class Computer{
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
public class Challenge19 {
public static void main(String[] args) {
	Computer c = new Computer();
	c.setBrand("Lenovo");
	c.setModel("Slim pad");
	c.setPrice(50000);
	System.out.println(c.getBrand());
	System.out.println(c.getModel());
	System.out.println(c.getPrice());	
}
}
