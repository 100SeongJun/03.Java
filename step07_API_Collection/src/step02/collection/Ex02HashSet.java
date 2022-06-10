package step02.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02HashSet {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();

		set1.add("Java");
		set1.add("Busan");
		set1.add("Study");
		set1.add("Happy");
		set1.add("Lazy");
		set1.add("Lazy");
		set1.add("Lazy");
		set1.add("d");
		set1.add("c");
		set1.add("a");
		set1.add("b");
		System.out.println(set1.getClass().getCanonicalName());

		// for문을 이용하여 출력해야함
		for (String arr : set1) {
			System.out.println(arr.length() + arr);
		}

		// iterator

		Iterator<String> iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();
		set1.remove("Lazy");
		System.out.println(set1);
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}

	}

}
