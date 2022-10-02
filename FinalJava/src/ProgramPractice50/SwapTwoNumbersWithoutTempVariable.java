//Swap two numbers without using temporary variable
package ProgramPractice50;
public class SwapTwoNumbersWithoutTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; int b = 20;
		System.out.println("Numbers before swapping ");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("Numbers after swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		

	}

}
	