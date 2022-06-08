package step02;

import model.domain.People;

public class Ex05Access {
	public static void main(String[] args) {
		People people = new model.domain.People();
//		System.out.println(people.age);	//직접접근이 불가
//		people.setAge(25);
		System.out.println(people.getName());

//		System.out.println(people.age);
	}
}