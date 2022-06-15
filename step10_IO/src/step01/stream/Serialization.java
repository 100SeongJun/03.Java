package step01.stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import model.domain.Kid;

public class Serialization {

	public static void main(String[] args) {
		// 객체 출력 - ObjectOutputStream
		try {
//			FileOutputStream fos = new FileOutputStream("Object.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(new String("Busan"));
//			oos.writeObject(new Integer(1));
//			oos.close();
//			fos.close();

//			FileInputStream fis = new FileInputStream("Object.txt");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			System.out.println(ois.readObject());
//			ois.close();
//			fis.close();

//			Kid kidOut = new Kid();
//			kidOut.setName("Busan");
//			kidOut.setAge(27);
//			kidOut.setPersonalNumber(12345);
//			ObjectOutputStream oosKid = new ObjectOutputStream(new FileOutputStream("Kid.txt"));
//			oosKid.writeObject(kidOut);
//			oosKid.close();

			/* test중 */
//			Kid kidOut2 = new Kid();
//			kidOut2.setName("성준");
//			kidOut2.setAge(26);
//			kidOut2.setPersonalNumber(123);
//			ObjectOutputStream oosKid2 = new ObjectOutputStream(new FileOutputStream("Kid.txt"));
//			oosKid2.

			ObjectInputStream oisKid = new ObjectInputStream(new FileInputStream("Kid.txt"));
			Kid kidIn = (Kid) oisKid.readObject();
			System.out.println(kidIn.getName() + "/" + kidIn.getAge() + "/" + kidIn.getPersonalNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
