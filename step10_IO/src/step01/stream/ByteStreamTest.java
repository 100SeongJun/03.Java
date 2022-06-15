package step01.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
	public static void fileSave() throws IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("ByteStream.txt");
			fos.write(97); // a
//			fos.write(65);
//			fos.write(66);
//			fos.write(67);
//			fos.write(68);
//			fos.write(69);

			byte[] data = { 65, 66, 67, 68, 69 };
			fos.write(data);
//			fos.write(data, 1, 3);
			fos.close();
		} finally {
			fos.close();
		}
	}

	public static void fileOpen() throws IOException {
		FileInputStream fis = new FileInputStream("ByteStream.txt");
		// step01
//		int data;
//		try {
//			fis.read();
//			while ((data = fis.read()) != -1) {
//				System.out.print((char) data);
//			}
//		} finally {
//			fis.close();
//		}
		// step02
		int fileSize = (int) new File("ByteStream.txt").length();
		byte[] readData = new byte[fileSize];

		fis.read(readData);
		for (int i = 0; i < fileSize; i++) {
			System.out.println((char) readData[i]);
		}
	}

	public static void main(String[] args) {
		try {
			fileSave();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fileOpen();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
