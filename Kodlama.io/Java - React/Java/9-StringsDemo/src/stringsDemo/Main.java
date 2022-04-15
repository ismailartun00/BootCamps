package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = " Bugün hava çok güzel. ";

		System.out.println(mesaj);

		 /* System.out.println("Eleman Sayýsý = " + mesaj.length());
		 * System.out.println("5. Eleman = " + mesaj.charAt(4));
		 * 
		 * // Ýçeriðini deðiþtirir fakat kullanmak için yeni deðiþkene aktarmamýz
		 * gerektir. System.out.println(mesaj.concat("Yaþasýn!"));
		 * 
		 * // Belirttiðimiz karakter ile baþlýyor mu veya bitiyor mu kontrol eder, true
		 * // veya false döndürür. System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5];
		 * 
		 * // 0: mesajýn alýnacak ilk index'i, 5:mesajýn alýnacak son index'i, karakterler: 
		 * // alýnan metin nereye atýlacak, 0: aktýralacak metin karakterlerin kaçýncý 
		 * // indexinden itibaren atýlmaya baþlansýn.
		 * mesaj.getChars(0, 4, karakterler, 0); System.out.println(karakterler);
		 * 
		 * // belirtilen karakteri metinin baþýndan aramaya baþlar ve bulduktan sonra //
		 * index'ini verir. System.out.println(mesaj.indexOf('a'));
		 * 
		 * // indexOf gibi çalýþýr fakat metnin sonundan baþýna doðru aramaya baþlar.
		 * System.out.println(mesaj.lastIndexOf("e")); */

		// metindeki belirtilen karakterleri farklý karakter ile deðiþtirir.
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		// istenilen index'den sonraki metni alýrýz
		System.out.println(mesaj.substring(2));

		// istenilen idex'ten istenilen index'e kadar metni getirir.
		System.out.println(mesaj.substring(2, 5));
		
		// istenilen karakterden sonraki kelimeleri ayýrýr.
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		// bütün metini küçük harfe çevirir.
		System.out.println(mesaj.toLowerCase());
		
		// bütün metini büyük harfe çevirir.
		System.out.println(mesaj.toUpperCase());
		
		// metinin baþýndaki ve sonundaki boþluklarý atar.
		System.out.println(mesaj.trim());
	}

}
