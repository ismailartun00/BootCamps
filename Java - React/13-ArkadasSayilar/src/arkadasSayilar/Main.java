package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// birinci say�n�n b�lenlerinin toplam�n�n ikinci say�ya e�it olmas� ve ikinci
		// say�n�n b�lenlerinin toplam�n�n da birinci say�ya e�it olmas�d�r.
		//220 ve 284 arkada� say�lard�r.
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 += i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 += i;
			}
		}

		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu iki say� Arkada� Say�lard�r.");
		}
		else {
			System.out.println("Bu iki Say� Arkada� Say� De�ildir.");
		}
	}

}
