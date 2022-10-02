//Find Factorial of a number using BigInteger
package ProgramPractice50;

import java.math.BigInteger;

public class FindFactorialBigInteger {
	public static void main(String[] args) {
		int num=30;
		BigInteger factorialBigInteger=BigInteger.ONE;
		for(int i=1;i<=num;i++) {
			 factorialBigInteger = factorialBigInteger.multiply(BigInteger.valueOf(i));
		}System.out.println("Factorial of Biginter "+num+" is "+factorialBigInteger);
		
	}

}
