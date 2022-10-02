//HashSet add, remove, iterator example
package ProgramPractice50;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetProg {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		System.out.println(hashSet);
		System.out.println(hashSet.remove("B"));
		System.out.println(hashSet);
		boolean found=hashSet.contains("C");
		System.out.println(found);
		Iterator<String> iterator=hashSet.iterator();
		while (iterator.hasNext()) {
			String valueString = (String) iterator.next();
			System.out.println("Value "+valueString);
		}
	}

}
