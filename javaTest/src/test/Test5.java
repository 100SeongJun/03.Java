//package test;
//
//class Person {
//	String name;
//	int age;
//	int weight;
//	
//	public Person() {}
//	public Person( String name, int age, int weight ) {
//		this.name = name;
//		this.age = age;
//		this.weight = weight;
//	}
//	
//	void wash() { System.out.println( "wash" ); }
//	void study() { System.out.println( "study" ); }
//	void play() { System.out.println( "play" ); }
//	public void setState(int num) {
//		System.out.println(num+1000);
//	}
////	public void in( int price, String name ) { System.out.printf( "%s 에게서 %d원 용돈을 받았습니다.%n", name, price ); }
//}
//
//class Student extends Person implements Allowance, Train {
//	Student() {}
//	Student( String name, int age, int weight ) {
//		super( name, age, weight );
//	}
//	
//	public void in(int price, String name ) { System.out.printf( "%s 에게서 %d원 용돈을 받았습니다.%n", name, price ); }
//	public void out( int price, String name ) { System.out.printf( "%d원 금액을 지출했습니다. [지출용도 --> %s]%n", price, name ); }
//	public void payTuitionFee( int tuitionFee, String name ) { System.out.printf( "[%s --> %d원 입금완료]%n", name, tuitionFee ); }
//}
//
//interface Allowance {
//	  public default void setState(int num) {
//		  System.out.println(num);
//	  }
//	  
//	abstract void in( int price, String name );
//	abstract void out( int price, String name );
//}
//
//interface Train {
//	abstract void payTuitionFee( int tuitionFee, String name );
//}
//
//
//
//public class Test5 {
//	public static void main(String[] args) {
//		Person person = new Person();
//		Student student = new Student();
//		person.wash();
//		person.study();
//		person.play();
//		student.in(10000, "엄마");
//		student.out(5000, "편의점");
//		student.payTuitionFee(50000, "훈련비");
//		//인터페이스 구현이 우선적으로 적용된다.
//		student.setState(30);
//		
//		// Test5 결과 출력하기 & extends와 implements중에서 우선적으로 적용되는 것은 무엇인지 확인해보기
//		/* 
//		 * wash
//		 * study
//		 * play
//		 * 엄마 에게서 10000원 용돈을 받았습니다.
//		 * 5000원 금액을 지출했습니다. [지출용도 --> 편의점]
//		 * [훈련비 --> 50000원 입금완료]
//		 */
//		
//
//		
//	}
//}
