package step03.abstrac;

public abstract class Computer {

	abstract void display();

	public void turnOn() {
		System.out.println("전원 On");
	}

	public void turnOff() {
		System.out.println("전원 Off");
	}
}
