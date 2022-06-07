package step01_syntax;

public class Ex02Variable {
	public static void main(String[] args) {
		// 타입 변수명 = 값;
		// 기본타임 (primitive) 타입
		// 정수 -2^(n-1) ~ 2^(n-1)-1
		// n : 비트수

		byte vb1 = -128;
		// byte vb2 = 128 //에러
		short vs1 = 128;

		int vi1 = 10;
		int vi2 = 0B1010; // 2진수 : 0B+2진수
		int vi3 = 012; // 8진수 : 0+8진수
		int vi4 = 0XA; // 16진수 : 0X+16진수

		System.out.println("vi1: "+vi1);
		System.out.println("vi2: "+vi2);
		System.out.println("vi3: "+vi3);
		System.out.println("vi4: "+vi4);

		// long vl1 = 10;
		// long vl2 = 10000000000L;
		// System.out.println(vl2.getClass().getName());
		// 실수 : float(32) , double(64)
		float vf1 = 3.14F;
		double vd1=3.14;
		System.out.println("vf1: "+vf1);
		System.out.println("vd1: "+vd1);	
		//문자 : char(16)
		char vc1= 'c';
		char vc2 = 65;
		char vc3 = '\u0042';
		String vS1 = "캐릭터형";
		System.out.println("vc1: "+vc1);
		System.out.println("vc2: "+vc2);
		System.out.println("vc3: "+vc3);
		System.out.println("vS1: "+vS1);
		
		//boolean(8)
		boolean vb=true; 
		System.out.println(vb);
		
	}

}