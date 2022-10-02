//Find GCD/HCF (Highest Comon Factor) of two numbers using for loop and if statement
package ProgramPractice50;

public class GCDOfTwoNumbers {

	public static void main(String[] args) {
		int n1=81,n2=153;
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++ ) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}System.out.println("GCD/HCD is "+gcd);
	}

}
