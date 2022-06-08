package view;

import java.util.Scanner;

import controller.StudentController;

public class StartView {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("=== \t1.모든 검색\t===");
			System.out.println("=== \t2.학생 검색\t===");
			System.out.println("=== \t3.학생 등록\t===");
			System.out.println("=== \t4.학생 정보 삭제 \t===");
			System.out.println("=== 5.학생 정보 수정(한살 추가)===");
			System.out.println("=== \t-1.종료\t\t===");
			int a = sc.nextInt();
			StudentController.request(a);
			if (a == -1) {
				sc.close();
				break;
			}
		}
	}
}
