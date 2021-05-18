package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer ayse = new IndividualCustomer();
		ayse.customerNumber = "12345";

		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber = "78910";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999";

		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = { ayse, abc, hepsiburada };
		customerManager.addMultiple(customers);
	}

}
