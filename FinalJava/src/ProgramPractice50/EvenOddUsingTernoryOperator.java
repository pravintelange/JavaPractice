//Check whether a number is even or odd using ternary operator
package ProgramPractice50;

import java.util.Scanner;

public class EvenOddUsingTernoryOperator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number to check even or odd");
		int num=scanner.nextInt();
		System.out.println("Enter any number");
		int num2=scanner.nextInt();
		String evenOrodd = (num%2==0)?"even":"odd";
		System.out.println(num+" is "+evenOrodd);
		String evenOddTwo=(num2%2==0)?"even":"odd";
		System.out.println(num2+" is "+evenOddTwo);
		
	}

}
