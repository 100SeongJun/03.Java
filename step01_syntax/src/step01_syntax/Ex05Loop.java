package step01_syntax;
/*반복문(Loop) */
public class Ex05Loop {
	public static void main(String[] args) {
		//for문
//		for (int i = 5; 1<=i; i--) {
//			System.out.println(i);
//		}
//		//while문
//		int i =1;
//		while(i<=5) {
//			System.out.println("while:"+i);
//			i++;
//		}
//	}
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}
//		while(i<=10);	//무조건 do 한 번 실행 후 loop 조건
		for(int i = 1; i<=9; i++) {
			for (int j =1; j<=9; j++) {
			System.out.printf("%d*%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}
	}
}
