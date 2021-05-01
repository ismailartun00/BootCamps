package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = " Bug�n hava �ok g�zel. ";

		System.out.println(mesaj);

		 /* System.out.println("Eleman Say�s� = " + mesaj.length());
		 * System.out.println("5. Eleman = " + mesaj.charAt(4));
		 * 
		 * // ��eri�ini de�i�tirir fakat kullanmak i�in yeni de�i�kene aktarmam�z
		 * gerektir. System.out.println(mesaj.concat("Ya�as�n!"));
		 * 
		 * // Belirtti�imiz karakter ile ba�l�yor mu veya bitiyor mu kontrol eder, true
		 * // veya false d�nd�r�r. System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler = new char[5];
		 * 
		 * // 0: mesaj�n al�nacak ilk index'i, 5:mesaj�n al�nacak son index'i, karakterler: 
		 * // al�nan metin nereye at�lacak, 0: akt�ralacak metin karakterlerin ka��nc� 
		 * // indexinden itibaren at�lmaya ba�lans�n.
		 * mesaj.getChars(0, 4, karakterler, 0); System.out.println(karakterler);
		 * 
		 * // belirtilen karakteri metinin ba��ndan aramaya ba�lar ve bulduktan sonra //
		 * index'ini verir. System.out.println(mesaj.indexOf('a'));
		 * 
		 * // indexOf gibi �al���r fakat metnin sonundan ba��na do�ru aramaya ba�lar.
		 * System.out.println(mesaj.lastIndexOf("e")); */

		// metindeki belirtilen karakterleri farkl� karakter ile de�i�tirir.
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		// istenilen index'den sonraki metni al�r�z
		System.out.println(mesaj.substring(2));

		// istenilen idex'ten istenilen index'e kadar metni getirir.
		System.out.println(mesaj.substring(2, 5));
		
		// istenilen karakterden sonraki kelimeleri ay�r�r.
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		// b�t�n metini k���k harfe �evirir.
		System.out.println(mesaj.toLowerCase());
		
		// b�t�n metini b�y�k harfe �evirir.
		System.out.println(mesaj.toUpperCase());
		
		// metinin ba��ndaki ve sonundaki bo�luklar� atar.
		System.out.println(mesaj.trim());
	}

}
