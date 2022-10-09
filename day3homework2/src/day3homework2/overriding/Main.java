package day3homework2.overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManagers = new BaseCreditManager[] { new OgretmenCreditManager(),
				new TarimKreditManager(), new OgrenciCreditManager() };
		for (BaseCreditManager baseCreditManager : creditManagers) {
			System.out.println(baseCreditManager.hesapla(1000));
		}

	}
}
