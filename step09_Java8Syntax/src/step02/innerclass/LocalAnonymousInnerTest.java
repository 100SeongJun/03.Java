package step02.innerclass;

class OutClass {
	int outNumber = 100;
	static int staticOutNumber = 200;

	// 지역클래스
	// Runnable = 리턴타입
	Runnable getRunnable(int i) {
		int number = 100;
//		class MyRunnable implements Runnable {
		return new Runnable() {
			int local_num = 10;

			@Override
			public void run() {
				System.out.println("외부,멤버instance" + outNumber);
				System.out.println("외부,static" + staticOutNumber);
				System.out.println();
//				i=100;			// final: 값변경되지 않음. 상수 풀  메모리에 계속 존재하는 것과 같음
//				number = 1000;  //
//				따라서 getRunnable 이라고 하는 메소드가호출되어 끝났다 할지라도
//				run메소드 내부에서 계속해서 호출하여 사용 할 수 있음
				System.out.println("외부,매개변수" + i);
				System.out.println("메소드,지역" + number);
				System.out.println("내부,멤버instance" + local_num);
			}
		};
//		return new MyRunnable(); // 지역클래스인데 외부에서 사용되지 않음.
	}

	// 익명클래스
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스변수");
		}
	};
}

public class LocalAnonymousInnerTest {

	public static void main(String[] args) {
		OutClass outclass = new OutClass();
		Runnable runner = outclass.runner;
		Runnable run = outclass.getRunnable(10);
		run.run();
		System.out.println();
		runner.run();
	}

}
