using System;

namespace _12_ClassMethodDemo {
    class Program {
        static void Main(string[] args) {
            Musteri musteri1 = new Musteri();
            musteri1.AdSoyad = "İsmail Artun";
            musteri1.Cinsiyet = 'E';
            musteri1.DogumYili = 28101996;

            Musteri musteri2 = new Musteri();
            musteri2.AdSoyad = "Aylin İnci";
            musteri2.Cinsiyet = 'K';
            musteri2.DogumYili = 14091998;

            Musteri musteri3 = new Musteri();
            musteri3.AdSoyad = "Başak Artun";
            musteri3.Cinsiyet = 'K';
            musteri3.DogumYili = 28101997;

            Musteri[] musteriler = new Musteri[] { musteri1, musteri2, musteri3 };

            MusteriManager musteriManager = new MusteriManager();
            musteriManager.Add("Osman Artun", 'E', 16062002);
            Console.WriteLine();
            musteriManager.ShowList(musteriler);
        }
    }
}
