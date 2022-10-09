package day3homework2.interfaces;

public class CustomerManager {
	private CustomerDao customerDao;
	
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void add() {
		this.customerDao.add();
	}
}
