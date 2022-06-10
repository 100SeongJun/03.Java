package step01.lombok;

import model.domain.Student;

public class LombokTest {

	public static void main(String[] args) {
		Student student = new Student("JAVA", 1, "Junior");
		System.err.println(student.getName());

	}

}
