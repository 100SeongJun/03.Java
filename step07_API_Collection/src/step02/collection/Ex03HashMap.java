package step02.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex03HashMap {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		// HashMap(K:V)
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("1번", 1);
		hm1.put("2번", 2);
		hm1.put("3번", 3);
		hm1.put("4번", 4);
		arr1.add("a");
		arr1.add("b");
		arr1.add("c");
		arr1.add("d");
		System.out.println(hm1);
		for (int value : hm1.values()) {
			System.out.println(value);
		}

		for (String key : hm1.keySet()) {
			System.out.println(key + ": " + hm1.get(key));
		}
		System.out.println(hm1);

		HashMap<String, ArrayList<String>> hm3 = new HashMap<>();
//		hm3.("arr1", arr1);
		System.out.println(arr1);
		hm3.put("arr1", arr1);
		System.out.println(hm3);
		System.out.println(hm3.get("arr1").get(2));
		HashMap<String, HashMap<String, ArrayList<String>>> hm4 = new HashMap<>();
		hm4.put("hm3", hm3);
		System.out.println(hm4.get("hm3"));
		System.out.println((hm4.get("hm3").get("arr1")).getClass().getName());
		System.out.println(((ArrayList<String>) hm4.get("hm3").get("arr1")).get(1));

		// entrySet
		System.out.println("=====entrySet=====");
		System.out.println(hm1.entrySet());
		Set<Entry<String, Integer>> entrySet = hm1.entrySet();
		System.out.println(entrySet);
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		int i = 0;
		while (entryIterator.hasNext()) {
			i++;
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(i + ":" + entry);
			System.out.println(entry.getValue());
		}
	}
}
