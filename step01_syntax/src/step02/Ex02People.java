package step02;

public class Ex02People {
	// 메소드
	// name 반환 메소드
	// 1. 메소드 명: getName
	// 2. 반환값 유무

	// 멤버 변수(필드)
	String name = "Java";
	int age = 27;

	// 이름 출력 메소드
	String getName() {
		return name;
	}

	// 나이 출력 메소드
	int getAge() {
		return age;
	}

	// 단순 출력 메소드
	void print() {
		System.out.println("단순출력메소드");
	}

	// 생성자 : 객체 생성 시, 필수 요소
	// 클래스 이름과 동일해야함
	Ex02People() {
	}

	// 사용자 정의 생성자
	Ex02People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Ex02People(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Ex02People ppl1 = new Ex02People();
		System.out.println(ppl1.age);
		System.out.println(ppl1.getName());
		ppl1.print();
		// ppl1에 대한 이름 변경
		ppl1.name = "new java";
		System.out.println(ppl1.getName());
		// ppl2
		Ex02People ppl2 = new Ex02People();
		System.out.println(ppl1.hashCode());
		System.out.println(ppl2.hashCode());

		// ppl3
		Ex02People ppl3 = new Ex02People("Java3", 45);
		System.out.println(ppl3.name);
		System.out.println(ppl3.age);
		System.out.println(((Object) ppl1.getClass().getName()));

		// ppl4
		Ex02People ppl4 = new Ex02People("Java4");
		System.out.println(ppl4.name);
		System.out.println(ppl4.age);
	}
}
