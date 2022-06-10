package step01.exception;

import Exception.NotAdminException;

public class Ex03Exception {
	// 관리자 계정 검증
	// - 고려사항
	// - 관리자인 경우 : 정상실행
	// - 관리자가 아닌 경우 : 비정상실행 -> 예외발생(Exception)
	// 상속받아 -> 사용자 정의 예외만듦 -NotAdminException

	public static void checkAdmin(String id) throws NotAdminException {
		if ("admin".equals(id)) {
			System.out.println("관리자 계정 접속 성공");
		} else {
			throw new NotAdminException("관리자 계정 접속 실패");
		}
	}

	public static void main(String[] args) {
		try {
			checkAdmin("-");
		} catch (NotAdminException e) {
			e.printStackTrace();
		}
	}
}
