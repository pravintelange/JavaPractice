package ProgramPractice50;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetToArrayList {

	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("A");
		System.out.println(hashSet);
		List<String> valueList=hashSet.stream().collect(Collectors.toList());
		System.out.println("ArrayList "+valueList);

	}

}
