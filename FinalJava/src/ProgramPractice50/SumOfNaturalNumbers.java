//Java Program to Calculate the Sum of Natural Numbers using for loop
package ProgramPractice50;

import java.util.Iterator;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		int num=100,sum=0;
		for(int i=0;i<=num;i++) {
			sum=i+sum;
			
		}
		System.out.println(" Total of natural numbers upto "+num+" is "+sum);
		
	}

}
