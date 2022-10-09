package day3homework2.overriding;

public class BaseCreditManager {
	//public in peşine final yazılırsa override edemezsin
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
