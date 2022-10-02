//Java Program to Check Whether a Character is Alphabet or Not
package ProgramPractice50;

public class AlphabetOrNot {
	public static void main(String[] args) {
		char ch='*';
		if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println(ch+" Its a alphabet");
		}else {
			System.out.println(ch+" Its not a alphabet");
		}
	}

}
