//Java Program to Swap Two Numbers using temporary variable
package ProgramPractice50;

public class SwapTwoNumbers {
	public static void main(String args[]) {
		int a=12,b=12345,c;
		System.out.println("Numbers before Swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		c=a;
		a=b;
	    b=c;
		System.out.println("Numbers after swappring");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
	}

}
