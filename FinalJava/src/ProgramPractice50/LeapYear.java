//Java Program to Check Leap Year
package ProgramPractice50;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter year");
		//boolean leap=false;
		Scanner scanner=new Scanner(System.in);
		
		int year=scanner.nextInt();
		System.out.println();
		if ((year%4==0) && (year%100!=0) ||(year%400==0)) {
			
			System.out.println(year+" is leap year");
			}else {
				System.out.println(year+" is not a leap year");
			}
		}
		
		
	}

