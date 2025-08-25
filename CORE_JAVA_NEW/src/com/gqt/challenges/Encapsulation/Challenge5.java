package com.gqt.challenges.Encapsulation;

class Car{
	private String model;
	private String color;
	private int prize;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
}
public class Challenge5 {
public static void main(String[] args) {
Car obj = new Car();
obj.setModel("Mercedes");
obj.setColor("Black");
obj.setPrize(7000000);
System.out.println(obj.getModel());
System.out.println(obj.getColor());
System.out.println(obj.getPrize());
}
}
