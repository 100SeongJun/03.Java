package step01_syntax;

import java.util.Scanner;

/*
 조건문 : 조건이 참 일 경우 
 */
public class Ex04_Condition {
	public static void main(String[] args) {
		// if문으로 관리자 id가 admin or admin2일때 접속 성공(단 else if사용)
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println((Object)(name).getClass().getName());
		if (name.equals("admin")) {
			System.out.println("접속성공");
		} else if (name.equals("admin2")) {
			System.out.println("접속성공");
		} else {
			System.out.println("접속 실패");
		}

		int month = sc.nextInt();
		switch (month) {
		case (1 | 2 | 3 ):
			System.out.println(month + "월입니다.");
			break;
		default :
			System.out.println("default");
		}
		
		
	}
}
