package step03;

import model.domain.Car;

public class CarFactory {
	private static CarFactory instance = new CarFactory();

	private CarFactory() {
	}

	public static CarFactory getInstance() {
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		car.setSerialNum(car.getSerialNum() + 1);
		car.setCarNum(car.getSerialNum());
		return car;
	}
}
