package model;

import java.util.HashMap;
import java.util.Scanner;

import view.EndView;

public class FruitsModel {
	private static Scanner sc = new Scanner(System.in);
	private static HashMap<String, Integer> fruits = new HashMap<String, Integer>();

	static {
		fruits.put("사과", 500);
		fruits.put("귤", 2500);
		fruits.put("바나나", 3000);

	}

	public static void addFruits() { // 1번. 과일 추가
		System.out.print("입력방식 (ex:과일이름,가격):");
		String input = sc.nextLine();
		String fruit = input.split(",")[0]; // 과일 이름, 구분자 "," (split의 return type: Array)

		if (EqualsName.equalName(fruit, fruits)) { // 같은이름 중복 예외처리
			System.out.println("중복되는 과일이 존재합니다.");
		} else {
			try {
				int price = Integer.parseInt(input.split(",")[1]); // 입력값의
				fruits.put(fruit, price);
				EndView.allList(fruits); // 결과값 출력
			} catch (Exception e) { // 숫자가 아닌 값 입력시 예외처리
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}

	public static void removeFruits() { // 2번. 과일 삭제
		EndView.allList(fruits); // 리스트 확인
		System.out.println("삭제할 과일 이름을 입력하세요");
		String removeFruits = sc.nextLine();
		if (EqualsName.equalName(removeFruits, fruits)) { // return boolean
			fruits.remove(removeFruits);
			EndView.allList(fruits);
		} else {
			System.out.println("삭제할 과일이 존재하지 않습니다.");
		}
	}

	public static void modifyFruits() { // 3번 특정 과일 가격 수정
		EndView.allList(fruits);
		System.out.println("수정할 과일 이름을 입력하세요");
		String modifyFruits = sc.nextLine();
		if (EqualsName.equalName(modifyFruits, fruits)) { // return boolean
			System.out.println("변경될 금액을 입력하세요(현재가: " + fruits.get(modifyFruits) + ")");
			try {

				int modifyPrice = sc.nextInt();
				if (modifyPrice <= 0) {
					System.out.println("입력값이 잘못되었습니다.");
				} else {
					fruits.put(modifyFruits, modifyPrice);
					EndView.allList(fruits);
				}
			} catch (Exception e) { // 숫자가 아닌 값 입력 시 예외처리
				System.out.println("숫자 입력이 잘못되었습니다.");
			}
		} else {
			System.out.println("등록되지 않은 과일입니다.");
		}
		System.out.println();
	}

	public static void searchList() { // 4. 특정 과일 조회
		System.out.println("과일을 입력해주세요:");
		String fruit = sc.nextLine();
		EqualsName.searchequalName(fruit, fruits);
	}

	public static void allList() { // 5번 모든 과일 조회
		EndView.allList(fruits);
	}

//	public static void 
}
