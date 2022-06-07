package step01_syntax;

public class Ex02Variable {
   public static void main(String[] args) {
      // 타입 변수명 = 값;
      // 기본타임 (primitive) 타입
      // 정수 -2^(n-1) ~ 2^(n-1)-1
      // n : 비트수
      
      byte vb1 = -128;
//      byte vb2 = 128 //에러
      short vs1 = 128;
      
      int vi1 = 10;
      int vi2 = 0B1010; // 2진수 : 0B+2진수
      int vi3 = 012; // 8진수 : 0+8진수
      int vi4 = 0XA; // 16진수 : 0X+16진수
      
      System.out.println(vi1);
      System.out.println(vi2);
      System.out.println(vi3);
      System.out.println(vi4);
      
      long vl1 = 10;
      long vl2 = 10000000000L;
      
//      System.out.println(vl2.getClass().getName());
   }

}