//Count Number of Digits in an Integer using while loop
package ProgramPractice50;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		
		int count=0;
		long num=0124253412;
		while(num!=0) {
			num=num/10;
			count++;
		}System.out.println("Digits="+count);
	}

}
