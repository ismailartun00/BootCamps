package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC
		System.out.println("Ürün Eklendi : " + product.getName());
	}

	// Çok hatalý bir kullanýmdýr.
	/*
	 * public void Add(int id, String name, String description, int stockAmount,
	 * double price) {
	 * 
	 * }
	 */
}
