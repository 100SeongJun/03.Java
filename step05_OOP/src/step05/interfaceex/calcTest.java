package step05.interfaceex;

public class calcTest {

	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		Calculator calc = new Calculator();
		System.out.println(calc.add(x, y));
		System.out.println(calc.sub(x, y));
		System.out.println(calc.div(x, y));
		Calc calc2 = new Calculator();
		System.out.println(calc2.add(2, 3));
		calc.turnOn();
		calc2.turnOn();

	}

}