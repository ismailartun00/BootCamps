package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static Yap�c� Blok �al��t�");
	}
	
	public ProductValidator() {
		System.out.println("Yap�c� Blok �al��t�.");
	}
	
	//static metotlar new'lenmedi�inde �a�r�labilir ve sistem tamamen kapanana kadar bellekte �al��maya devam eder. Constructorlar �al��maz.
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	//class i�erisinde ba�ka bir class tan�mlayabiliriz : innerClass
	//innerClass'lara static �zelli�i verilebilir fakat normal class'lara static �zelli�i verilemez.
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
}