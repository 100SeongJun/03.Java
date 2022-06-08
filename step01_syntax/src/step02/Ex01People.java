package step02;

public class Ex01People {
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
	Ex01People() {
	}

	public static void main(String[] args) {
		Ex01People ppl1 = new Ex01People();
		System.out.println(ppl1.age);
		System.out.println(ppl1.getName());
		ppl1.print();

	}
}
