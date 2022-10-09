package day3homework2.abstractDemo;

public class CustomerManager {
	private BaseDatabaseManager databaseManager;

	public CustomerManager(BaseDatabaseManager databaseManager) {

		this.databaseManager = databaseManager;
	}

	public void getCustomers() {
		this.databaseManager.getData();
	}
}
