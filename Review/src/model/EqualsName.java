package model;

import java.util.HashMap;

public class EqualsName {

	public static boolean equalName(String fruit, HashMap<String, Integer> fruits) {
//		if (fruits.containsKey(fruit)) {
//			return true;
//		} else {
//			return false;
//		}
		for (String key : fruits.keySet()) {
			if (key.equals(fruit)) {
				return true;
			}
		}
		return false;
	}

	public static void searchequalName(String fruit, HashMap<String, Integer> fruits) {
		if (fruits.containsKey(fruit)) {
			System.out.println(fruit + ": " + fruits.get(fruit));
		} else {
			System.out.println("등록되지 않은 과일입니다.");
		}
		System.out.println();
	}
}
