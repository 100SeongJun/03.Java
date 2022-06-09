package step02.oop;

//Animal
class Animal {

	public void move() {
		System.out.println("Animal Move");
	}

	public void eating() {

	}
}

class Human extends Animal {
	public void move() {
		System.out.println("Human Move");
	}

	public void readBooks() {
		System.out.println("Human Read books");
	}
}

class Tiger extends Animal {

	public void move() {
		System.out.println("Tiger Move");
	}

	public void hunting() {
		System.out.println("Tiger Hunt");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("Eagle Move");
	}

	public void fly() {
		System.out.println("Eagle Fly");
	}
}

public class AnimalTest {
	public static void downCasting(Animal[] animalArray) {
		for (int i = 0; i < animalArray.length; i++) {
			Animal animal = animalArray[i];
			animal.move();
			if (animal instanceof Human) {
				((Human) animal).readBooks();

			} else if (animal instanceof Tiger) {
				((Tiger) animal).hunting();

			} else if (animal instanceof Eagle) {
				((Eagle) animal).fly();

			} else {
				System.out.println("error");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// 다형성(
		// UpCasting
//		Animal human = new Human();

		// DownCasting
		Animal human = new Human();
//		Human human1 = (Human) human;
//		human.move();
//		human1.readBooks();
//		Human man = new Human();
//		man.move();
//		man.readBooks();
//		System.out.println();
		Animal tiger = new Tiger();
//		tiger.hunting();
//		tiger.eating();
		Animal eagle = new Eagle();
//		eagle.fly();
//		eagle.eating();
		Animal[] animalArray = { human, tiger, eagle };
//		for (Animal animal : animalArray) {
//			animal.move();
//		}
		downCasting(animalArray);
//		public void downCasting(anmalArray)

	}

}
