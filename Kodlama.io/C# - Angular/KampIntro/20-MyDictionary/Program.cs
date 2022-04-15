using System;

namespace _20_MyDictionary {
    class Program {
        static void Main(string[] args) {
            MyDictionary<string, int> adPlaka = new MyDictionary<string, int>();
            adPlaka.Add("İsmail", 25);
            adPlaka.Add("Aylin", 28);
            adPlaka.Add("Murat", 10);
            adPlaka.Add("Müslüm", 57);

            adPlaka.List();
            Console.WriteLine();
            Console.WriteLine("Count is " + adPlaka.Count);
            Console.WriteLine();
        }
    }
}
