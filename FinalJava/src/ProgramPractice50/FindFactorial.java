//Find Factorial of a number 
package ProgramPractice50;

public class FindFactorial {

	public static void main(String[] args) {
		int num=10;
		long factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial=i*factorial;
			
		}System.out.println("Factorial of "+num+" is "+factorial);

	}

}
