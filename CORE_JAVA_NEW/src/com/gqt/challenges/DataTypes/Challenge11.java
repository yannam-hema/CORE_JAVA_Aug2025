package com.gqt.challenges.DataTypes;

import java.util.Scanner;

public class Challenge11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the byte data");
	Byte b= new Byte(sc.nextByte());
	System.out.println("Byte data "+b);
	
	System.out.println("Enter the short data");
	Short s= new Short(sc.nextShort());
	System.out.println("Short data "+s);
	
	System.out.println("Enter the Integer data");
	Integer i = new Integer(sc.nextInt());
	System.out.println("Integer data "+i);
	
	System.out.println("Enter the Long data");
	Long l= new Long(sc.nextLong());
	System.out.println("Long data "+l);
	
	System.out.println("Enter the float data");
	Float f= new Float(sc.nextFloat());
	System.out.println("Float data "+f);
	
	System.out.println("Enter the Double data");
	Double d = new Double(sc.nextDouble());
	System.out.println("Double data "+d);
	
	System.out.println("Enter the String data");
	sc.nextLine();
	String str= new String(sc.nextLine());
	System.out.println("String data "+str);
	
	Character c = new Character('a');
	System.out.println("Character data "+c);
	
	Boolean b1= new Boolean(true);
	System.out.println("Boolean data "+b1);
	sc.close();
}
}
