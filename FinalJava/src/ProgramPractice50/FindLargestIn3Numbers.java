//Java Program to Find the Largest Among Three Numbers
package ProgramPractice50;

import java.util.Scanner;


public class FindLargestIn3Numbers {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter first number");
	int firstInterger=scanner.nextInt();
	System.out.println("Enter second number");
	int secondInteger=scanner.nextInt();
	System.out.println("Enter third number");
	int thirdInteger=scanner.nextInt();
	scanner.close();
	System.out.println("You entered"+firstInterger+", "+secondInteger+" and "+thirdInteger );
	if (firstInterger>secondInteger && firstInterger>thirdInteger) {
		System.out.println(firstInterger+" is the biggest");
	} else if (secondInteger>thirdInteger) {
		System.out.println(secondInteger+" is the biggest");
	}else {
		System.out.println(thirdInteger+" is the biggest");
	}
	
}
}