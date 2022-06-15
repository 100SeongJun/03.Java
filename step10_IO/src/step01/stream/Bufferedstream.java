package step01.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bufferedstream {

	public static void main(String[] args) throws FileNotFoundException {
		// Buffer 입력 혹은 출력에 대한 임시 저장공간 ->데이터를 한번에 처리하는 보조 스트링
		// Writer - BufferedWriter 연결
		// FileWriter - BufferedWriter
//		try {
//			BufferedWriter bw = new BufferedWriter(new FileWriter("cheerup.txt"));
//			bw.write("잠와요,,\n ");
//			bw.write("잠와요,,\n ");
//			bw.write("잠와요,,");
//			bw.write("잠와요,");
//			bw.close();
//		} catch (IOException e) {
////			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			BufferedReader br = new BufferedReader(new FileReader("cheerup.txt"));
//			String msg;
//			while ((msg = br.readLine()) != null) {
//				System.out.println(msg);
//
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// Buffered 보조스트림 성능 차이 실습
		long startTime;
		long endTime;

		try {
			// 미사용
			FileInputStream fis = new FileInputStream("whale_img06.jpg");
			int i = 0;
			startTime = System.currentTimeMillis();
			while (fis.read() != -1) {
				i++;
			}
			System.out.println(i);
			endTime = System.currentTimeMillis();
			System.out.println("미사용:" + (endTime - startTime) + "ms");
			fis.close();
			// 사용
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("whale_img06.jpg"));
			startTime = System.currentTimeMillis();
			i = 0;
			while (bis.read() != -1) {
				i++;
			}
			endTime = System.currentTimeMillis();
			System.out.println(i);
			System.out.println("사용:" + (endTime - startTime) + "ms");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
