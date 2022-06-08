package step03;

public class Singleton02 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.say();
		instance.setName("호이");
		Singleton instance2 = Singleton.getInstance();
		instance2.setName("Si");
		instance2.getName();
		System.out.println(instance); // 주소값 : 366712642
		System.out.println(instance2); // 주소값 : 366712642
										// 주소값 동일
	}
}
