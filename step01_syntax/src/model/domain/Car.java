package model.domain;

public class Car {

	private int carNum;
	private static int serialNum = 343;

	// 생성자
	public Car() {
	}

	// getter
	public int getCarNum() {
		return carNum;
	}

	public int getSerialNum() {
		return serialNum;
	}

	// setter
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

}

//package model.domain;
//
//public class Car {
//
//	private int carNum;
//	private static int serialNum = 343;
//
//	// 생성자
//	public Car() {
//		serialNum++;
//		this.carNum = serialNum;
//	}
//
//	// getter
//	public int getCarNum() {
//		return carNum;
//	}
//
//	// setter
//	public void setCarNum(int carNum) {
//		this.carNum = carNum;
//	}
//
//}
