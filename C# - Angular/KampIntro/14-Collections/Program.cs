using System;
using System.Collections.Generic;

namespace _14_Collections {
    class Program {
        static void Main(string[] args) {
            List<string> isimler = new List<string>() { "Engin", "Murat", "Kerem", "Halil" };

            List<string> isimler2 = new List<string>();
            isimler2.Add("Engin");
            isimler2.Add("Murat");
            isimler2.Add("Kerem");
            isimler2.Add("Halil");

            foreach (string isim in isimler2) {
                Console.WriteLine(isim);
            }

            isimler2.Add("Ismail");
            Console.WriteLine("--------------------------");

            foreach (string isim in isimler2) {
                Console.WriteLine(isim);
            }
        }
    }
}
