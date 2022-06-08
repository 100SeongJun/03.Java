/* 컨트롤러
 * StartView -> 요청한 처리 결과를 반환 -> EndView 전달
 * - 수행기능
 * 		1 - 모든 검색
 * 		2 - 개인 (1명) 검색 : 이름으로 검색
 * 		3 - 저장
 * 		4 - 삭제
 * 		5 - 수정
 * 
 */
package controller;

import java.util.Scanner;

import model.StudentModel;
import model.domain.Student;
import view.EndView;

public class StudentController {

	public static void request(int reqNumber) {
		Scanner sc = new Scanner(System.in);
		if (reqNumber == 1) {
			EndView.printAll(StudentModel.getAll());

		} else if (reqNumber == 2) {
			System.out.println("이름을 입력하여주세요:");
			String input = sc.nextLine();
			EndView.printOne(StudentModel.getOne(input));

		} else if (reqNumber == 3) {
			System.out.println("이름을 입력하세요:");
			String name = sc.nextLine();
			System.out.println("나이를 입력하세요:");
			int age = sc.nextInt();
			boolean r = StudentModel.insert(new Student(name, age));

			if (r) {
				EndView.printSuccess("등록 성공");
			} else {
				EndView.printFail("등록 실패");
			}

		} else if (reqNumber == 4) {
			System.out.println("삭제할 이름을 입력하세요:");
			String name = sc.nextLine();
			StudentModel.delete(name);

		} else if (reqNumber == 5) {
			EndView.printOne(StudentModel.updateAge("Java"));
		}
	}
}
