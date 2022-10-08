package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
//		DortIslem dortIslem = new DortIslem();
//		int sonuc = dortIslem.Topla(3, 4);
//		System.out.println(sonuc);
		
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Black");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);
		
		System.out.println(product.getKod());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		

	}

}
