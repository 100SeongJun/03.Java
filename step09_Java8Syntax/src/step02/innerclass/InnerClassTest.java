package step02.innerclass;

class OuterClass {
	private int number = 10;
	private static int staticNumber = 20;
	private InClass inClass;

	public OuterClass() {
		inClass = new InClass();
		System.out.println("OutClass 생성됨");
	}

	class InClass {
		public InClass() {
			System.out.println("InClass 생성됨");
		}

		int inNumber = 100;

		void inPrint() {
			System.out.println("외부 클래스, 인스턴스 변수 = " + number); // 인스턴스 -> 객체가 생성됐을 때를 말함
			System.out.println("외부클래스, static 변수 = " + staticNumber);
			System.out.println("내부클래스, 인스턴스 변수 = " + inNumber);
		}
	}

	static class StaticInClass {
		int inNumber = 100;
		static int staticInNumber = 200;
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InClass inClass = outerClass.new InClass();
		System.out.println(inClass);

		OuterClass.StaticInClass staticInClass = new OuterClass.StaticInClass();
	}

}
