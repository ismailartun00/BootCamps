package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static Yapýcý Blok Çalýþtý");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý Blok Çalýþtý.");
	}
	
	//static metotlar new'lenmediðinde çaðrýlabilir ve sistem tamamen kapanana kadar bellekte çalýþmaya devam eder. Constructorlar çalýþmaz.
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	//class içerisinde baþka bir class tanýmlayabiliriz : innerClass
	//innerClass'lara static özelliði verilebilir fakat normal class'lara static özelliði verilemez.
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
}