package step01.api;

class Busan {
	public int num;

	public Busan(int num) {
		this.num = num;
		System.out.println("Busan" + num + "가 생성");
	}

	public void finalize() {
		System.out.println("Busan" + num + "가 제거");
	}
}

public class Ex01LangPackage {

	public static void main(String[] args) {
		// Object 클래스
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.getClass().getName());
		System.out.println(obj2.getClass().getName());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		// equals : 동일 객체 비교 결과 반환
		System.out.println(obj1.equals(obj2));
		// hashCode : 객체의 주소값으로 정수로 변환 및 반환
		// toString : 문자열로 된 객체의 정보를 반환

		// System 클래스
		// getProperty: 시스템 속성 값을 반환
		System.out.println(System.getenv("UserName"));
		// gc : garbage collector 쓰레기 수집기

//		Busan busan;
//		busan = new Busan(1);
//		busan = null;
//		busan = new Busan(2);
//		busan = new Busan(3);
//		busan.finalize();
//		System.gc();

		// String Class
//		String str1 = "   3ABCD3   ";
//		String str2 = "Java API String Test";
//		System.out.println(str1.substring(1, 4));
//		System.out.println(str1.replace("AB", "JAVA  "));
//		System.out.println(str1.trim());
//		System.out.println(str2.split(" "));
//		StringBuilder str3 = new StringBuilder("a");
//		String str4 = "a";
//		System.out.println(str4.equals(str3.toString()));
//		System.out.println((Object) str3.getClass().getName());
//		for (String i : str2.split(" ")) {
//			str3.append(i);
//
//		}
//		System.out.println(str3);

		// Wrapper Class
		// Boxing
		Integer intgr1 = new Integer(1);
		System.out.println(intgr1.getClass().getName());
		System.out.println(intgr1.valueOf(1));
		// UnBoxing
		System.out.println(intgr1.intValue());
		// parse
		System.out.println(Integer.parseInt("3"));
		System.out.println(Double.parseDouble("3"));

		// Math Class

		System.out.println("\nMath Class");
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.floor(3.4));
		System.out.println(Math.round(3.4));
		System.out.println(Math.ceil(3.6));
		System.out.println(Math.floor(3.6));
		System.out.println(Math.round(3.6));

	}
}
