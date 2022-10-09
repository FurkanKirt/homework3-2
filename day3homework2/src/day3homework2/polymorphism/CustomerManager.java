package day3homework2.polymorphism;

public class CustomerManager {
	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("müþteri eklendi");
		// private olduu için bu klasta anlamýnda this le baþlaman gerekiyor
		this.baseLogger.Log("tamamdýr");
	}
}
