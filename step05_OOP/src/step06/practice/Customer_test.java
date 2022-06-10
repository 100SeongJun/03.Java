package step06.practice;

public class Customer_test {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.order();
		customer.buy();
		customer.sell();

		Buy buyer = customer;
		System.out.println("------");
		buyer.buy();
		buyer.order();

		Sell seller = customer;
		System.out.println("-------");
		seller.sell();
		seller.order();
	}

}
