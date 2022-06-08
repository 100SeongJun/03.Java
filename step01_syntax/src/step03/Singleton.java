package step03;

public class Singleton {

	// 멤버변수 필드
	String Name = "Singleton";
	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

	public void say() {
		System.out.println("Hi,there");
	}

	public void setName() {
//		this.Name = Name;
		System.out.println(this.Name);
	}

	public void setName(String Name) {
		this.Name = Name;
		System.out.println(this.Name);
	}

	public void getName() {
		System.out.println(Name);
	}
}
