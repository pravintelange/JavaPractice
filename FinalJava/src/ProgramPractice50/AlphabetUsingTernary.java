//Java Program to Check Alphabet using ternary operator
package ProgramPractice50;

public class AlphabetUsingTernary {
	public static void main(String[] args) {
		char ch='P';
	String outputString=(ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ? ch+" is alphabet":ch+" is not a alphabet";
	System.out.println(outputString);
	}
}
