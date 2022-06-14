package step03.lambda;

public class LambdaTest {
	interface LambdaInter1 {
		void method();
	}

	interface LambdaInter2 {
		void method(int x);
	}

	interface LambdaInter3 {
		int method(int x, int y);
	}

	interface Calculation {
		int operation(int v1, int v2);
	}

	static int operation(int num1, int num2, Calculation result) {
		return result.operation(num1, num2);
	}

	public static void main(String[] args) {
		// 1. Lambda1 : 매개변수가 없는 람다식
//		LambdaInter1 li1;
//		li1 = () -> {
//			System.out.println("li1호출");
//		};
//		System.out.println(li1.getClass().getSimpleName());
//		li1.method();
//
//		// 2. Lambda2 : 매개변수가 하나인 람다식
//		LambdaInter2 li2;
//
//		li2 = x -> System.out.println(x);
//		li2.method(20);
//
//		// 3. Lambda3 : 매개변수가 2개인 람다식
//		LambdaInter3 li3;
//		li3 = (x, y) -> x + y;
//		System.out.println(li3.method(10, 20));
//		LambdaInter3 li4;
//		li4 = (x, y) -> {
//			if (x < y) {
//				return y - x;
//			} else {
//				return x - y;
//			}
//		};
//		Calculation add = (v1, v2) -> v1 + v2;
//		Calculation sub = (v1, v2) -> v1 - v2;
//		Calculation mul = (v1, v2) -> v1 * v2;
//		Calculation div = (v1, v2) -> v1 / v2;
//		System.out.println(operation(5, 5, add)); // 10
//		System.out.println(operation(5, 5, sub)); // 0
//		System.out.println(operation(5, 5, mul)); // 25
//		System.out.println(operation(5, 5, div)); // 1

//		System.out.println(add.operation(5, 5)); // 10
//		System.out.println(sub.operation(5, 5)); // 0
//		System.out.println(mul.operation(5, 5)); // 25
//		System.out.println(div.operation(5, 5)); // 1

		// 클래스 + 인터페이스 vs 람다식 구현 차이를 비교

		// 두가지 문자열을 연결하고 !기호를 붙이는 인터페이스 vs 람다식
		String str1 = "Hello";
		String str2 = "Java";
		System.out.println("---bangMark1---");
		BangMarkImpl bangmark = new BangMarkImpl();
		bangmark.addBangMark(str1, str2);
		System.out.println("---bangMark2---");
		BangMark bangMark2 = (s1, s2) -> System.out.println(s1 + "" + s2 + "!");
		bangMark2.addBangMark(str1, str2);

		BangMark bangMark3 = new BangMark() {
			@Override
			public void addBangMark(String str1, String str2) {
				System.out.println(str1 + "" + str2 + "!");
			}
		};
		System.out.println("---bangMark3---");
		bangMark3.addBangMark(str1, str2);
	}

}
