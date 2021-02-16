using _30_InterfaceAbstractDemo.Abstract;
using _30_InterfaceAbstractDemo.Concrete;
using _30_InterfaceAbstractDemo.Entities;
using _30_InterfaceAbstractDemo.Adapters;
using System;

namespace _30_InterfaceAbstractDemo {
    class Program {
        /* Senaryo
         * Kahve dükyanları için müşteri yönetimi yapan bir sistem yapmak istiyoruz.
         * Starbucks ve Neo firması için çalışıyoruz. İki firma da müşterilerini veri
         * tabanına kaydetmek istiyor. Starbucks müşterilerini kaydederken, mutlaka
         * mernis dogrulaması istiyor. Nero müşterileri kaydederken mernis dogrulaması
         * istemiyor. Starbucks müşterileri kahve aldıgında yıldız kazandırmak istiyor.
         * Veriler aynı veri tabanına kaydediliyor gibi düşünelim.(verileri FirmaID'ye 
         * göre  yönetecegiz)
         */
        static void Main(string[] args) {
            BaseCustomerManager customerManagerStarbucks = new StarbucksCustomerManeger(new MernisServiceAdapter());
            customerManagerStarbucks.Save(new Customer {
                //mernis sistemin calışabimesi için dogru veriler girilmelidir
                //doğru değer verildi.
                DateOfBirth = new DateTime(1996, 10, 28),
                FirstName = "İsmail",
                LastName = "Artun",
                NationalityId = "27298649254"
            });

            BaseCustomerManager customerManagerStarbucks1 = new StarbucksCustomerManeger(new MernisServiceAdapter());
            customerManagerStarbucks1.Save(new Customer {
                //mernis sistemin calışabimesi için dogru veriler girilmelidir
                //yanlış değer verildi.
                DateOfBirth = new DateTime(2002, 2, 12),
                FirstName = "Osman",
                LastName = "Artun",
                NationalityId = "28582545679"
            });

            BaseCustomerManager customerManagerNero = new NeroCustomerManager();
            customerManagerNero.Save(new Customer {
                //mernis sistemini kullanmıyor.
                DateOfBirth = new DateTime(1998, 9, 14),
                FirstName = "Aylin",
                LastName = "İnci",
                NationalityId = "12312312312"
            });
            Console.ReadLine();

        }
    }

}
