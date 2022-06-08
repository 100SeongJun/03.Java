package step02;

public class Ex03Object {
	public static void main(String[] args) {
//		A a = new A();
		B b = new B();
//		C c = new C();
	}
}

class A {
	String name = "Class A";
	int age = 24;

	A() {
		System.out.println("A클래스에서 생성됨");
	}

	A(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("(name,age)A클래스에서 생성됨");
	}

	A(int age) {
		this.age = age;
	}

	A(String name) {
		this.name = name;
	}

}

class B {
	// 멤버 변수처럼 생성됨
	A c = new A();
	String name = "Class B";
	int age = 27;
	A a = new A(name, age);
	A a2 = new A(33);

	B() {
		System.out.println(a.name);
		System.out.println("B클래스에서 생성됨");
		System.out.println(a2.age);
	}

}

class C {
	C() {
		System.out.println("C클래스에서 생성됨");
	}

}
