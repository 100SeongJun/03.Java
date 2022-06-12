package contoroller;

import model.FruitsModel;

public class FruitsCtrl {
	public static void request(int num) {

		switch (num) {
		case 1: // 과일 등록
			FruitsModel.addFruits();
			break;

		case 2: // 과일삭제
			FruitsModel.removeFruits();
			break;
		case 3: // 과일 가격 수정
			FruitsModel.modifyFruits();
			break;

		case 4: // 특정 과일 조회
			FruitsModel.searchList();
			break;
		case 5: // 모든 과일 조회
			FruitsModel.allList();
			break;
		default: // 잘못된 입력값
			System.out.println("입력값이 잘못 되었습니다.");
			break;
		}
	}
}
