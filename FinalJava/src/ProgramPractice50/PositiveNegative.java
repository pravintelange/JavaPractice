//Java Program to Check Whether a Number is Positive or Negative using if...else
package ProgramPractice50;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Number to check positive or negative");
		double number=scanner.nextDouble();
		if(number<0.0) {
			System.out.println("Number is negative");
		}else if (number>0) {
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is zero");
		}
	}

}
