package model;

import java.util.Arrays;
import java.util.stream.Stream;

import model.domain.Student;

public class StudentModel {

	// DB 역할
	private static Student[] allData = new Student[5];
	private static int index;

	// 가상의 데이터 저장
	static {
		allData[0] = new Student("Java", 25);
		allData[1] = new Student("Python", 29);
		allData[2] = new Student("C++", 37);
		index = 3;
	}

	// 모든 학생 검색
	public static Student[] getAll() {
		return allData;
	}

	// 한 학생의 정보만 검색
	public static Student getOne(String name) {
		for (int i = 0; i < index; i++) {
			if (allData[i] != null && allData[i].getName().equals(name)) {
				return allData[i];
			}
		}
		return null;

	}

	// 저장 메소드
	/*
	 * Student 객체가 배열에 저장 개발 - 고려사항 1 : 매개변수 값으로 name, age -> Student 객체 생성 -> 배열에
	 * 저장 - 고려사항 2 : 매개변수 값으로 Student 객체 -> 배열에 저장
	 */
	public static boolean insert(Student student) {
		if (student != null) {
			if (index != 5) {

				allData[index] = new Student(student.getName(), student.getAge());
				index++;
				return true;
			} else {
				System.out.println("학생 입력칸이 가득 찼습니다.");
			}
		}
		return false;
	}

	// 삭제 메소드
	/*
	 * 개발 - 고려사항 1 : 미존재 데이터 삭제? - 고려사항 2 : 존재 데이터 삭제? - 삭제의 의미 : 배열의 값 삭제 - 만약 1.
	 * 마지막 index 데이터 삭제 2. 중간 index 데이터 삭제 - 모든 사람 정보 검색 데이터 출력에 문제 - 고려사항 1. 실행시 존재
	 * 하지 않는 객체 출력 에러 발생 가능 2. 검증 필수
	 * 
	 * - 이름으로 삭제 1. 반복문을 통해서 이름값과 매개변수값을 비교
	 */
	public static boolean delete(String name) {
		for (int i = 0; i <= index - 1; i++) {
			if (allData[i] != null && allData[i].getName().equals(name)) {
				allData[i] = null;
				Stream<Student> strStream = Arrays.stream(allData);
				strStream.filter(data -> data != null).forEach(data -> System.out.println());
				System.out.println("삭제완료");
//				index--;
				return true;
			}
		}
		System.out.println("삭제할 데이터가 없습니다.");
		return false;
	}

	// 수정 : 이름으로 검색 -> 학생의 이름이 있다면 -> 한살 추가 // updateAge
	public static Student updateAge(String name) {

		return null;
	}
}
