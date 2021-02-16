using System;

namespace _11_Arrays {
    class Program {
        static void Main(string[] args) {
            string[] students = new string[3];
            students[0] = "Engin";
            students[1] = "Derin";
            students[2] = "Salih";

            string[] students2 = new string[3] { "Engin", "Derin", "Salih" };

            string[] students3 = { "Engin", "Derin", "Salih" };

            foreach (string student in students3) {
                Console.WriteLine(student);
            }
        }
    }
}
