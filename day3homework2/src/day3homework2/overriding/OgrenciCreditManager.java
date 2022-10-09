package day3homework2.overriding;

public class OgrenciCreditManager extends BaseCreditManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}

}
