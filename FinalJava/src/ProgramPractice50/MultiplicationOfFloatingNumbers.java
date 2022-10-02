//Java Program to Multiply two Floating Point Numbers
package ProgramPractice50;

import java.util.Scanner;

public class MultiplicationOfFloatingNumbers {
	public static void main(String args[]) {
		System.out.println("Enter two numbers for multiplication");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first float number");
		float a=scanner.nextFloat();
		System.out.println("Enter second float number");
		float b=scanner.nextFloat();
		float c=a*b;
		System.out.println("Multiplication of "+a+" & "+b+" is "+c);
	}

}
