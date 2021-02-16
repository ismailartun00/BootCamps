using System;
using System.Linq;

namespace _10_Methods {
    class Program {
        static void Main(string[] args) {
            /*Add();
            Add();
            Add();
            Add();
            var result0 = Add2(20);
            var result = Add2(20, 30);
            int number1 = 20;
            int number2 = 100;
            var result1 = Add3(ref number1, number2);
            Console.WriteLine(result1);
            Console.WriteLine(number1);

            Console.WriteLine(result);

            Console.WriteLine(Multiply(2, 3));
            Console.WriteLine(Multiply(2, 3, 4));*/

            Console.WriteLine(Add4(1,2,3,4,5,6));
            Console.ReadLine();
        }
        static void Add() {
            Console.WriteLine("Added!!!");
        }
        //default değer tanımlayacaksak hep sonda tanımlamamız gerekir.
        static int Add2(int number1, int number2=30) {
            return number1 + number2;
        }
        //c++'da & olan işareti c#'da ref keyword ile belirtiyoruz fonksiyonu tanımlarkende çağırırkende ref keyword'ünü kullanırız.
        //ref yerine out'da kullanabiliriz. 
        //ref ve out farkı ise ref main içerisinde değer atanmış olmasını zorunlu kılar, out fonksiyon içerisinde değer atanmış olmasını zorunlu kılar.
        static int Add3(ref int number1, int number2) {
            number1 = 30;
            return number1 + number2;
        }
        //Method Overloading
        static int Multiply(int number1, int number2) {
            return number1 * number2;
        }
        static int Multiply(int number1, int number2, int number3) {
            return number1 * number2 * number3;
        }

        //params keyword
        //istediğimiz kadar veri gönderebilmemiz için parametreyi dizi gibi tanımlıyoruz.
        //ilk parametreyi number değişkenine atacak, diğerlerini params ile tanınan numbers'a
        static int Add4(int number, params int[] numbers) {
            return numbers.Sum();
        }
    }
}
