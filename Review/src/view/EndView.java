package view;

import java.util.HashMap;

public class EndView {

	public static void allList(HashMap<String, Integer> fruits) {
		for (String key : fruits.keySet()) {
			System.out.println(key + "\t:" + fruits.get(key) + "원");
		}
		System.out.println();
	}

}
