package ProgramPractice50;

import java.security.PublicKey;
import java.util.Scanner;

public class Pallindrome {
	static int sum = 0;
	static int temp;
	static int r = 101;
	static int q;

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
		System.out.println("Type String Input as a word");
		String strm = "aba";
		String rev = "";
		int a = strm.length();
		pallindromeString(strm, rev);
		int p = 101, q;
		int temp = p;
		pallindromeNumber(r);

	}

	public static void pallindromeString(String strm, String rev) {
		for (int i = strm.length() - 1; i >= 0; i--) {
			rev = rev + strm.charAt(i);
		}
		System.out.println(rev);
		if (strm.equals(rev)) {
			System.out.println("Its pallindrome String");
		} else {
			System.out.println("Its not a pallindrome");
		}
	}

	public static void pallindromeNumber(int p) {
		while (p != 0) {
			q = p % 10;
			sum = (sum * 10) + q;
			p = p / 10;
		}
		if (p == temp) {
			System.out.println(r);
			System.out.println("Its a pallindrome number");
		} else {
			System.out.println("Its not a pallindrome");
		}
	}
}
