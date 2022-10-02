//Java Program to Reverse a Number using while
package ProgramPractice50;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=1234567,rev=0;
		System.out.println("The given number is "+num);
		while(num!=0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}System.out.println("THe reverse number of given number is "+rev);
	}

}
