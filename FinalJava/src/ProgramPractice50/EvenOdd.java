//Java Program to Check Whether a Number is Even or Odd using scanner and if..else
package ProgramPractice50;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=scanner.nextInt();
		if(a%2==0) {
			System.out.println(a+" is even number");
		}else{
			System.out.println(a+" is odd Number");
		}

	}

}
