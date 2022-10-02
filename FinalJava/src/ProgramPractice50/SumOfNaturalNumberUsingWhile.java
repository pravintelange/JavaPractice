package ProgramPractice50;

public class SumOfNaturalNumberUsingWhile {

	public static void main(String[] args) {
		int number=50,sum=0,i=1;
		while(i<=number) {
			sum=i+sum;
			i++;
		}System.out.println("Sum of natural numbers upto "+number+" is "+sum);
	}

}
