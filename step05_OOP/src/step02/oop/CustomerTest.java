package step02.oop;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerCentum = new Customer();
//		customerCentum.setCustomerId(10001);
//		customerCentum.setCustomerName("Centum");
//		customerCentum.setBonusPoint(1000);
//		System.out.println(customerCentum.showCustomerInfo());
//		VIPCustomer customerSuyeong = new VIPCustomer();
//		customerSuyeong.setCustomerId(10002);
//		customerSuyeong.setCustomerName("Suyeong");
//		customerSuyeong.setBonusPoint(1000);
//		System.out.println(customerSuyeong.showCustomerInfo());
//
//		// 사용자 정의 생성자
//		Customer customers = new Customer(10001, "Baek");
//		System.out.println(customers.showCustomerInfo());

		VIPCustomer aaa = new VIPCustomer(10001, "BB");
//		System.out.println(aaa.showCustomerInfo());
		System.out.println("\nPrice: " + aaa.calcPrice(1000) + "\n" + aaa.showCustomerInfo());
	}

}
