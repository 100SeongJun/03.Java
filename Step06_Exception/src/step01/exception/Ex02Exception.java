package step01.exception;

class Info {
	static {
		System.out.println("Info 클래스");
	}
}

public class Ex02Exception {

	public static void main(String[] args) {
//		Info info = new Info();
		try {
			System.out.println(1 / 0);
			Class.forName("step01.exception.Info2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("11111111");
			e.printStackTrace();
		} finally {
			System.out.println("2222222222");
		}
	}

}
