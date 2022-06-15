package step01.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest {
	public static void main(String[] args) {
		// Writer
		try {
			FileWriter fw = new FileWriter("CharacterStream.txt");
//			fw.write("여행이 너무 가고싶어요\n");
//			fw.append("곰");
			fw.write("  \n\n\r");

//			fw.write(new char[] { '\\', 'n', '가', '평' });
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Reader
		try {
			FileReader fr = new FileReader("CharacterStream.txt");
			int data;
			try {
				while ((data = fr.read()) != -1) {
					System.out.println(data);
//					System.out.print((char) data);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
