package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = { new SmsLogger(), new EmailLogger(),new FileLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer ayse = new Customer(1, "Ay�enur", "Ert�rk");
		customerManager.add(ayse);
	}

}
