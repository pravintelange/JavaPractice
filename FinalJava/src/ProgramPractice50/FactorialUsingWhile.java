//Find Factorial of a number using while loop
package ProgramPractice50;

public class FactorialUsingWhile {

	public static void main(String[] args) {
		int i=1,num=5;
		long factorail=1;
		while(i<=num) {
			factorail=i*factorail;
			i++;
		}System.out.println("Factorial of given number "+num+" is "+factorail);

	}

}
