package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		// JDBC
		System.out.println("�r�n Eklendi : " + product.getName());
	}

	// �ok hatal� bir kullan�md�r.
	/*
	 * public void Add(int id, String name, String description, int stockAmount,
	 * double price) {
	 * 
	 * }
	 */
}
