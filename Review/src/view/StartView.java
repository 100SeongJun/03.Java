package view;

import java.util.Scanner;

import contoroller.FruitsCtrl;

public class StartView {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("과일 품목 조회");
			System.out.println(" 1. 과일 등록");
			System.out.println(" 2. 과일 삭제");
			System.out.println(" 3. 과일 가격수정");
			System.out.println(" 4. 특정과일 조회");
			System.out.println(" 5. 모든 과일 조회");
			System.out.println("-1. 종료");
			try {
				int input = sc.nextInt();
				if (input == -1) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				FruitsCtrl.request(input);
			} catch (Exception e) {
				System.out.println("\n1~5까지의 숫자를 입력해주세요:");

			}
		}
	}
}
