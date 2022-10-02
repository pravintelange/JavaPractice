//Java Program to Display Fibonacci Series using for loop
package ProgramPractice50;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstTerm=0,secondTerm=1,num=10,nextTerm;
		System.out.println("Fibonacci Series till "+num+" terms");
		for(int i=1;i<=num;i++) {
			System.out.print(firstTerm+",");
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			
		}

	}

}
