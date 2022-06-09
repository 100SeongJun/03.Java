package step02.oop;
/*
 * 제품 구입 시 10% 할인된 가격으로 제공
 * 보너스 포인트는 제품 가격의 5% 적립
 * staffid 배정
 */

public class VIPCustomer extends Customer {
//	private int customerId;
//	private String customerName;
//	private String customerGrade;
//	private int bonusPoint;
//	private double bonusRatio;

	private String staffid;
	private double saleRatio;

	public VIPCustomer() {
//		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");
	}

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;

	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int) price * saleRatio;
		return price;
	}
}
