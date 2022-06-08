package step02;

public class Ex04Static {
	// 멤버변수와 static 멤버변수 선언
	String name;
	static String company;
	// 변하면 안되는 수 (상수)
	final static double pi = 3.14;

	Ex04Static() {
	};

	Ex04Static(String name, String company) {
		this.name = name;
		this.company = company;
	};

	public static void main(String[] args) {

		System.out.println(company);
		Ex04Static Stac = new Ex04Static("JAva", "douzone");
		System.out.println(Stac.company);
		System.out.println(pi);
	}

}
