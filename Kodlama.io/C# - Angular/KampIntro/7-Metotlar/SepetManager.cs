using System;
using System.Collections.Generic;
using System.Text;

namespace _7_Metotlar {
    class SepetManager {
        public void Ekle(Urun urun) {
            Console.WriteLine("Tebrikler. Sepete Eklendi : " + urun.Adi);
        }
        
        public void Ekle2(string urunAdi, string aciklama, double fiyat, int stokAdedi) {
            Console.WriteLine("Tebrikler. Sepete Eklendi: " + urunAdi);
        }
    }
}
