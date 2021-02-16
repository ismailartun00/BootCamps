using System;

namespace _1_KampIntro
{
    class Program
    {
        static void Main(string[] args)
        {
            //Type Safety - Tip Güvenliği
            //Do Not Repeat Yourself - Kendini Tekrar Etme
            string kategoriEtiketi = "Kategori ";
            int ogrenciSayisi = 32000;
            double faizOrani = 1.45;
            bool sistemeGirisYapmisMi = true;
            double dolarDun = 7.35;
            double dolarBugun = 7.45;



            Console.WriteLine(kategoriEtiketi);

            if (dolarDun > dolarBugun)
            {
                Console.WriteLine("Azalış Butonu");
            }
            else if (dolarDun < dolarBugun)
            {
                Console.WriteLine("Artış Butonu");
            }
            else
            {
                Console.WriteLine("Değişmedi Butonu");
            }

            if (sistemeGirisYapmisMi == true)
            {
                Console.WriteLine("Kullanıcı Ayarları Butonu");
            }
        }
    }
}
