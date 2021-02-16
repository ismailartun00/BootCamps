using System;

namespace _29_AbstractClass {
    class Program {
        static void Main(string[] args) {
            AbstractClass z = new DerivedClass1();
            z.deneme();
        }
    }


    class DerivedClass1 : AbstractClass {
        public override void Deneme() {
            Console.WriteLine("DerivedClass1 overrided");
        }
    }
    class DerivedClass21 : AbstractClass {
        public override void Deneme() {
            Console.WriteLine("DerivedClass1 overrided");
        }
    }
    //Abstract class'dan nesne türetilemez fakat referansını alabiliriz.
    //Abstract class kullanıyorsak muhakkak inherit etmeliyiz amacı bu çünkü.
    /*-Kalıtım yaparken kullanırız. 
    -new anahtar sözcüğü ile nesne oluşturulmaz. 
    -Değişken ve metot barındırabilir. 
    -Abstract sınıflardan üretilen sınıfların abstract metotları implement etmesi zorunludur abstract olmayan metotları override etmeden kullanabilirler. 
    -Çoklu kalıtım desteklemez. 
    -static tanımlanmaz. 
    -Kendisinden kalıtım alan sınıf ile arasında is-a ilişkisi vardır.
    -sealed olarak işaretlenemez
    -public, protected olarak tanımlanmalıdır metotlar
    -abstract olarak tanımlanan metotlar inherit edilen sınıflarda override edilmelidir.
    -abstract metotlar static olarak işaretlenemez.
    -abstract class'da normal yani implemented operations tanımlayabiliriz.
    -abstract field tanımlanamaz
    -abstract properties tanımlayabiliriz fakat onların da get ve set fonksiyonlarını override etmemiz gerekiyor.*/
    abstract class AbstractClass {
        public void deneme() {
            Console.WriteLine("Deneme");
        }

        public abstract void Deneme();
    }
}
