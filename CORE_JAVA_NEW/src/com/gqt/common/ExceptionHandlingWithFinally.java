package com.gqt.common;
import java.util.Scanner;

public class ExceptionHandlingWithFinally {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the first number : ");
			int n1 = sc.nextInt();//critical statement -- InputMismatchException
			System.out.println("Enter the second number : ");
			int n2 = sc.nextInt();//critical statement -- InputMismatchException

			int res = n1 / n2;//critical statement -- ArithmeticException

			System.out.println(res);
			System.out.println("-----------------");
			System.out.println("Array Operation");
			System.out.println("Enter the array size : ");
			int size = sc.nextInt();//critical statement -- InputMismatchException
			int arr[] = new int[size];//critical statement -- NegativeArraySizeException
			System.out.println("Enter the value to be added : ");
			int val = sc.nextInt();//critical statement -- InputMismatchException
			System.out.println("Enter the position into which value has to be added : ");
			int pos = sc.nextInt();//critical statement -- InputMismatchException
			arr[pos] = val;//critical statement -- ArrayIndexOutOfBoundsException
			System.out.println("value added");
		}
//		//specific catch block
//		catch(InputMismatchException  | ArithmeticException ae  ) {
//			System.out.println("Input Mismatch  Exception is generated and handled "
//					+ " or Arithmetic Exception is generated and handled ");
//		}
//		catch(NegativeArraySizeException  |ArrayIndexOutOfBoundsException nas) {
//			System.out.println("Negative Array Size  Exception is generated and handled " 
//		+ " or Array Index out of Bound Exception is generated and handled");
//		}
//		
		//generic catch block
		catch (ArithmeticException e) {
			System.out.println("Exception Occured and handled in catch block." +e);
		}
		
		finally {
			System.out.println("Finally bolck is Executed");
		}
	}
}
