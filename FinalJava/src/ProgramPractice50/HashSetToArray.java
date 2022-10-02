package ProgramPractice50;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("E");
		String[] valueStrings=new String[hashSet.size()];
		hashSet.toArray(valueStrings);
		System.out.println(Arrays.toString(valueStrings));

	}

}
