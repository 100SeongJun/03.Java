package test;


abstract class Animal {
}

class Dog {
	public Dog() {};
	public void cry() {
		System.out.println("멍멍!");
	}
}

class Cat {
	public Cat() {};
	public void cry() {
		System.out.println("야옹!");
	}
}

class Cow {
	public Cow() {};
	public void cry() {
		System.out.println("음메!");
	}
}

class Animal2 {
	public Animal2() {};
	public void fly() {
		System.out.println("읭읭!");
	}
}

public class Test2 {
	public static void main(String[] args) {
		
		// Test2 결과 출력하기
		/*
		 * 윙윙!
		 * 멍멍!
		 * 야옹!
		 * 음메!
		 */
		
		Animal2 dragonfly = new Animal2();
		dragonfly.fly(); // 윙윙!
		Dog dog = new Dog();
		dog.cry();  // 멍멍!
		Cat cat = new Cat();
		cat.cry();  // 야옹!
		Cow cow = new Cow();
		cow.cry();  // 음메!
		// Animal을 상속 받아도 cry메서드를 오버라이드해야하기 때문에 굳이 상속을 하진 않았습니다.
		
	}
}
