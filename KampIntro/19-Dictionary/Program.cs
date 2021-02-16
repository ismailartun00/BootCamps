using System;
using System.Collections.Generic;
using System.Linq;

namespace _19_Dictionary {
    class Program {
        static void Main(string[] args) {
            /*
            1) Dictionary sınıfı içinde sizin belirleyeceğiniz bir key'e uygun olarak değer saklar zorunluluğu var
            2) key türünü belirlemeniz şart (string, int, ...)
            */
            Dictionary<string, int> adYas = new Dictionary<string, int>();
            adYas.Add("Amy", 25);
            adYas.Add("Mehmet", 17);
            adYas.Add("Beril", 30);

            foreach (var degerOku in adYas) {
                Console.WriteLine(degerOku);
            }

            //değer atama özelliği
            var eleman = adYas.Count();
            Console.WriteLine();
            Console.WriteLine("Eleman Sayısı: " +eleman);

            //değer silme özelliği
            adYas.Remove("Beril");
            Console.WriteLine();
            foreach (var degerOku in adYas) {
                Console.WriteLine(degerOku);
            }
            var eleman1 = adYas.Count();
            Console.WriteLine();
            Console.WriteLine("Eleman Sayısı: " + eleman1);
        }
    }
}
