package step01_syntax;

public class Ex02Variable {
   public static void main(String[] args) {
      // Ÿ�� ������ = ��;
      // �⺻Ÿ�� (primitive) Ÿ��
      // ���� -2^(n-1) ~ 2^(n-1)-1
      // n : ��Ʈ��
      
      byte vb1 = -128;
//      byte vb2 = 128 //����
      short vs1 = 128;
      
      int vi1 = 10;
      int vi2 = 0B1010; // 2���� : 0B+2����
      int vi3 = 012; // 8���� : 0+8����
      int vi4 = 0XA; // 16���� : 0X+16����
      
      System.out.println(vi1);
      System.out.println(vi2);
      System.out.println(vi3);
      System.out.println(vi4);
      
      long vl1 = 10;
      long vl2 = 10000000000L;
      
//      System.out.println(vl2.getClass().getName());
   }

}