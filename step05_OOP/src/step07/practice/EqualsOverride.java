package step07.practice;

class Person1 {
	String name;
	int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * equals 재정의 1. 매개변수로 들어온 Object 타입의 객체 -> Person 타입으로 형변환이 가능한지 검증 2
	 * instanceof 3. name, age비교 4. 검증 후 name, age가 갖고 있는 데이터가 동일한 경우 -> return true
	 */
	@Override
	public boolean equals(Object object) {

		if (object instanceof Person1) {
			Person1 person = (Person1) object;
			if (name.equals(person.name) && (person.age == age)) {
				return true;
			}

		}
		return false;
	}
}

class Person2 {
	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class EqualsOverride {

	public static void main(String[] args) {
		Person1 p1 = new Person1("Java", 28);
		Person1 p2 = new Person1("Java", 28);
		Person2 p3 = new Person2("Java", 28);
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p3.hashCode());
//		System.out.println(p2.toString());
//		System.out.println(p2.age);
//		System.out.println(p1.getClass().getName().equals(p2));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}

}
