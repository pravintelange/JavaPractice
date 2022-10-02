//Count Number of Digits in an Integer using for loop
package ProgramPractice50;

public class CountDigitInNumber {

	public static void main(String[] args) {
		int count=0;
		long num=104021991;
		for(;num!=0;num=num/10,count++) {}
		System.out.println("Total Digits="+count);
	}

}
