package day3homework2.abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleDatabaseManager());
		
		customerManager.getCustomers();
	}

}
