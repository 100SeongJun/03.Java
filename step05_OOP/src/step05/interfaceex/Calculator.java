package step05.interfaceex;

public class Calculator implements Calc {
	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		return x - y;
	}

	@Override
	public int mul(int x, int y) {

		return x * y;
	}

	@Override
	public double div(int x, int y) {
		if (y != 0) {
			return x / (double) y;
		} else {
			System.out.println("에러");
			return ERROR;
		}
	}

}
