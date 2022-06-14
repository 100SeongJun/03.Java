package step02.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Ex04InOut {

	public static void main(String[] args) {
		Stack<String> card = new Stack<String>();
		System.out.println("---Stack---");
		card.push("1");
		card.push("2");
		card.push("3");
		card.push("4");
		card.push("5");
		System.out.println(card.pop());
		Deque<String> drinkBox = new LinkedList<String>();
		System.out.println("---Queue---");
		drinkBox.push("1");
		drinkBox.push("2");
		drinkBox.push("3");
		drinkBox.push("4");
		System.out.println("peek:" + drinkBox.peek());
		System.out.println("pop:" + drinkBox.pop());
		System.out.println(drinkBox);
	}

}
