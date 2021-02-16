using System;

namespace _7_Metotlar {
    class Program {
        static void Main(string[] args) {
            string urunAdi = "Elma";
            double fiyati = 15;
            string aciklama = "Amasta Elması";

            string[] meyveler = new string[] {"Elma", "Karpuz"};

            Urun urun1 = new Urun();
            urun1.Adi = "Elma";
            urun1.Fiyati = 15;
            urun1.Aciklama = "Amasta Elması";

            Urun urun2 = new Urun();
            urun2.Adi = "Karpuz";
            urun2.Fiyati = 80;
            urun2.Aciklama = "Diyarbakır Karpuzu";

            Urun[] urunler = new Urun[] {urun1, urun2};

            //type safe -- tip güvenli
            //var veri tipi auto veri tipi gibidir.
            foreach (Urun urun in urunler) {
                Console.WriteLine(urun.Adi);
                Console.WriteLine(urun.Fiyati);
                Console.WriteLine(urun.Aciklama);
                Console.WriteLine("---------------------");
            }

            Console.WriteLine("---------------------METOTLAR---------------------");
            //instance - örnek
            //encapsulation

            SepetManager sepetManager = new SepetManager();
            sepetManager.Ekle(urun1);
            sepetManager.Ekle(urun2);

            sepetManager.Ekle2("Armut", "Yeşil Armut", 12, 10);
            sepetManager.Ekle2("Elma", "Yeşil Elma", 14, 9);
            sepetManager.Ekle2("Karpuz", "Diyarbakır Karpuzu", 16, 8);
        }
    }
}

//Don't Repeat Yourself - DRY - CleanCode - Best Practice