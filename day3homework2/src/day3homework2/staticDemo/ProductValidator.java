package day3homework2.staticDemo;

public class ProductValidator {
	// statik ara� amac�yla kullan�ca��m�z yap�larda static yazd��m�zda newleme
	// ihtiyac�m�z ortadan kalkar bir kere kendili�inden newlenir herkes onu
	// kullan�r
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {// ! i�areti de�ilse anlam�nda
			return true;
		} else {
			return false;
		}
	}
	public void bisey() {
		
	}
}
