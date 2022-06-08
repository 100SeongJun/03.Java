// 도메인 모델
package model.domain;

public class People {
	// 멤버변수 filed
	private String name;
	private int age;

	// getMethod (getter)
	public String getName() {
		return this.name;
	}

	int getAge() {
		return age;
	}

	// setMethod (setter)
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("입력값이 유효하지 않습니다.");
		}
		System.out.println(this.age);
	}

	public void setName(String name) {
		this.name = name;

	}

	// 기본 생성사
	public People() {
	}

	// 사용자 정의 생성자

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
