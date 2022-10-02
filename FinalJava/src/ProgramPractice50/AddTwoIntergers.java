//Example: Program to Add Two Integers
package ProgramPractice50;

import java.util.Scanner;

public class AddTwoIntergers {
	public static void main(String args[]) {
		System.out.println("Enter two input for Addition");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first Element");
		int a=scanner.nextInt();
		System.out.println("Enter second Element");
		int b=scanner.nextInt();
		int  c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is  = "+c);
	}

}
