package step01_syntax;

class Constructor {
	int num1;
	static int num2;
}
public class Ex01syntax {
	static final double PI = 3.14;

	public static int addNum(int a, int b) {
		int result = a + b;
		return result;
	}
	public static int subNum(int a, int b) {
		int result = Math.max(a, b) - Math.min(a, b);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(addNum(1, 5));
		System.out.println(subNum(11,11));
	}

}

