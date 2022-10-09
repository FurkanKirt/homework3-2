package day3homework2.staticDemo;

public class ProductValidator {
	// statik araç amacýyla kullanýcaðýmýz yapýlarda static yazdðýmýzda newleme
	// ihtiyacýmýz ortadan kalkar bir kere kendiliðinden newlenir herkes onu
	// kullanýr
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {// ! iþareti deðilse anlamýnda
			return true;
		} else {
			return false;
		}
	}
	public void bisey() {
		
	}
}
