//Java Program to Check Alphabet using isAlphabetic() Method
package ProgramPractice50;

public class UsingAlphabetic {

	public static void main(String[] args) {
		char ch='*';
		if (Character.isAlphabetic(ch)){
			System.out.println(ch+" is an alphabet");
		}else {
				System.out.println(ch+" is not an alphabet");
			}
		}

	
}

