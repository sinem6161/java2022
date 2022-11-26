package staticDemo;

public class ProductValidator { // ana class'a static veremiyoruz
	
	static {
		System.out.println("Static Yapıcı blok çalıştı");
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product) {
		if(product.price >0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static class BaskaBirClass{ //Inner class'a static yazabiliyoruz.
		public static void Sil() {
			
		}
	}

}
