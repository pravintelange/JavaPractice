//Java Program to Reverse a Number
package ProgramPractice50;

public class ReverseNumberUsingForLoop {

	public static void main(String[] args) {
		int num=-123456;
		int rev=0;
		for(;num!=0;num=num/10) {
			int remainder=num%10;
			rev=rev*10+remainder;
		}System.out.println("The reverse of the number is "+rev);

	}

}
