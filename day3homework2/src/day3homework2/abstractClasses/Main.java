package day3homework2.abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator calculator = new WomanGameCalculator();
		calculator.hesapla();
		calculator.gameOveer();
		// abstract sýnýflar newlenemez!!!!
		GameCalculator calculator2 = new ManGameCalculator();
		calculator2.hesapla();

	}

}
