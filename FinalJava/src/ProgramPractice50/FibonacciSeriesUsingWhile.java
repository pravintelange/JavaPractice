//Display Fibonacci series using while loop
package ProgramPractice50;

public class FibonacciSeriesUsingWhile {

	public static void main(String[] args) {
	int firstTerm=0,secondTerm=1,num=10,nextTerm,i=1;
	System.out.printf("Fibonacci series of %d \n",num);
	while(i<=num) {
		System.out.printf(firstTerm+",");
		 nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
		i++;
	}

	}

}
