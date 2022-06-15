package step01.stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.domain.Student;

public class Serialization2 {

	public static void main(String[] args) {
		Student person1 = new Student("Seongjun", 3, 17);

		try {
//			ObjectOutputStream person = new ObjectOutputStream(new FileOutputStream("Studnet.txt"));
//			person.writeObject(person1);
//			person.close();

			System.out.println("작업완료");

			ObjectInputStream inperson = new ObjectInputStream(new FileInputStream("Studnet.txt"));
			Student student = (Student) inperson.readObject();
			System.out.println(student.getStudentId());
			inperson.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
