package step01_enumtype;

public class NumberTest {

	public static void main(String[] args) {
		// Number Class
		System.out.println("주소값: " + Number.values());
		System.out.println("타입: " + Number.values().getClass().getName());
		// System.out.println(Number.valueOf("ONE").getIntnumber());
		for (Number i : Number.values()) {
			System.out.println(i + ":" + i.getIntnumber() + ":" + i.getStrnumber() + ":" + i.ordinal());
		}
	}

}
