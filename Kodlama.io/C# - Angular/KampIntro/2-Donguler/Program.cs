using System;

namespace _2_Donguler
{
    class Program
    {
        static void Main(string[] args)
        {
            string kurs1 = "Yaılım Geliştirici Yerleştirme Kampı";
            string kurs2 = "Programlamaya Başlangıç için Temel Kurs";
            string kurs3 = "Java";
            string kurs4 = "Python";

            Console.WriteLine(kurs1);
            Console.WriteLine(kurs2);
            Console.WriteLine(kurs3);
            Console.WriteLine(kurs4);
            Console.WriteLine("-----------------");

            string[] kurslar = new string[] { "Yaılım Geliştirici Yerleştirme Kampı", "Programlamaya Başlangıç için Temel Kurs", "Java", "Python" };

            for (int i = 0; i < kurslar.Length; i++)
            {
                Console.WriteLine(kurslar[i]);
            }
            Console.WriteLine("sayfa sonu - footer");
            Console.WriteLine("-----------------");
            foreach (var kurs in kurslar)
            {
                Console.WriteLine(kurs);
            }
            Console.WriteLine("sayfa sonu - footer");
        }
    }
}
