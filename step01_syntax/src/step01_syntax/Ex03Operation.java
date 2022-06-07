package step01_syntax;

import java.util.Scanner;

public class Ex03Operation {
	public static void main(String[] args) {
		// 숫자연산 : + - *, /
		int v1 = 10;
		int v2 = 3;
		// 증감연산
		System.out.println("v1: " + ++v1);
		System.out.println("v1: " + v1++);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + --v2);
		System.out.println("v2: " + v2--);
		System.out.println("v2: " + v2);
		
		// 기본연산
		byte v3 = 10;
		System.out.println(v3);
		byte v4 = 3;
		System.out.println(v4);
		System.out.println((((Object) (v3 + v4)).getClass().getSimpleName()));

		System.out.println((float) v3 / v4);
		// 논리연산: &,|,^,!
		boolean isTrue = true;
		boolean isFalse = false;
		
		System.out.println(isTrue & isFalse);
		System.out.println(isTrue | isFalse);
		System.out.println(isTrue ^ isFalse);	//두 조건의 결과값이 다른 경우 xor
		System.out.println(isTrue ^ isTrue);
		// & 와 &&의 차이점: &는 두 조건을 무조건 검사하는 것, &&는 첫번째 조건이 참일 경우에만 검사
		
		// 비교연산 : <, <= , >, >=, ==, !=
		System.out.println("3 != 2:");
		int num2 = 1;
		double num3 = 1.0;
		System.out.println(((Object)(num3)).getClass().getName());
		System.out.println(((Object)(num2)).getClass().getName() == ((Object)(num3)).getClass().getName());
		
		// 대입연산 : =,+=,-=,...
		
		int assign = 2;
		System.out.println(assign);		
		assign *= assign;
		System.out.println(assign);
		
		// 문자열 (String)연산
		String str1 = "String 1:";
		String str2 = "String 1:";
		String str3 = "String 2:";
		String str4 = new String("String 1:");
		System.out.println(str2==str4);
		System.out.println(str2+(Object)(str2).getClass().getName());
		System.out.println(str4+(Object)(str4).getClass().getName());
		System.out.println(str4+(Object)(str2).getClass().getName());
		System.out.println(System.identityHashCode(str4));	// str4 주소값
		System.out.println(System.identityHashCode(str2));	// str2 주소값
		// == : 주소값 비교 / equals : 값 비교
		//String xx = new Integer(10);
		String xx ="10";
		String yy = new String("10");
		System.out.println("equals: "+xx.equals(yy));
		System.out.println("==: " +( xx==yy));
		
		// 삼항연산 --> 조건 ? 결과1: 결과2 
		Scanner sc = new Scanner(System.in);
//		double meat = 67;
		System.out.println("Please enter g : ");
		int meat = sc.nextInt();
		
		String grade= (meat>67.5)? "A등급" : "그 외 등급";
		System.out.println(grade);
		
		
	}
}