package day3homework2.polymorphism;

public class CustomerManager {
	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("m��teri eklendi");
		// private olduu i�in bu klasta anlam�nda this le ba�laman gerekiyor
		this.baseLogger.Log("tamamd�r");
	}
}
