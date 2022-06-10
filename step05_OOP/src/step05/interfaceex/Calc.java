package step05.interfaceex;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999;

	int add(int x, int y);

	int sub(int x, int y);

	int mul(int x, int y);

	double div(int x, int y);

	// java8버전 이후 만들어진
	default void turnOn() {
		System.out.println("turn On");
	}

}
