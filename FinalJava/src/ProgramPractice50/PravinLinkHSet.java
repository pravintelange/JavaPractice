//LinkedHashSet add, remove, iterator example
package ProgramPractice50;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PravinLinkHSet {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		linkedHashSet.add("E");
		linkedHashSet.add("A");
		System.out.println(linkedHashSet);
		
		linkedHashSet.remove("C");
		System.out.println("After remove"+linkedHashSet);
		boolean contains=linkedHashSet.contains("E");
		System.out.println("it contain?"+contains);
		Iterator<String> itrIterator=linkedHashSet.iterator();
		while(itrIterator.hasNext()) {
			String valueString=itrIterator.next();
			System.out.println("Value ="+valueString);
		}
	}

}
