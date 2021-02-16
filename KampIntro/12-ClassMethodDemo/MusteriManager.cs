using System;
using System.Collections.Generic;
using System.Text;

namespace _12_ClassMethodDemo {
    class MusteriManager {
        public void Add(string adSoyad, char cinsiyet, double dogumYili) {
            Musteri musteri = new Musteri();
            musteri.AdSoyad = adSoyad;
            musteri.Cinsiyet = cinsiyet;
            musteri.DogumYili = dogumYili;
            Console.WriteLine(musteri.AdSoyad + " is added.");
        }
        public void ShowList(Musteri[] musteriler) {
            foreach (Musteri musteri in musteriler) {
                Console.WriteLine(musteri.AdSoyad);
                Console.WriteLine(musteri.Cinsiyet);
                Console.WriteLine(musteri.DogumYili);
                Console.WriteLine("------------------");
            }
        }
    }
}
