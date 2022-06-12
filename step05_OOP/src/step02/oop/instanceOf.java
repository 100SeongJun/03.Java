package step02.oop;

public class instanceOf {
	public static void main(String[] args) {
		class A {
		}
		class B extends A {
		}
		class C extends A {
		}

		A a1 = new B();
		A a2 = new C();
		A a3 = new A();

		System.out.println(a1 instanceof A); // True
		System.out.println(a1 instanceof B); // True
		System.out.println(a1 instanceof C); // False

		System.out.println();

		System.out.println(a2 instanceof A); // True
		System.out.println(a2 instanceof B); // False
		System.out.println(a2 instanceof C); // True
		System.out.println(a3 instanceof A);
	}
}
