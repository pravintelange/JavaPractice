//Display Fibonacci series up to a given number
package ProgramPractice50;

public class FibonacciSeriesUptoNumber {
	public static void main(String [] args) {
	int i=100,firstTerm=0,secondTerm=1;
	System.out.println("Fibonacci series upto "+i);
	while(firstTerm<=i) {
		System.out.printf(firstTerm+",");
		int nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
		
	}

}
}