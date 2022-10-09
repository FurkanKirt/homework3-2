package day3homework2.polymorphism;

public class Main {

	public static void main(String[] args) {

		// EmailLogger emailLogger=new EmailLogger();
		// emailLogger.Log("mail attýk");

		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(),
				new ConsoleLogger() };
		for (BaseLogger baseLogger : loggers) {
			baseLogger.Log("logladýk");
		}
		System.out.println("-----------");
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}
	

}
