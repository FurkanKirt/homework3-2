package day3homework2.staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if (ProductValidator.isValid(product)) {
			System.out.println("eklendi");
		} else {
			System.out.println("bilgiler ge�ersiz");
		}
	}
}
