using System;

namespace _16_ReferenceTypes {
    class Program {
        static void Main(string[] args) {
            //int, decimal, float, enum, boolean, ... value types
            int sayi1 = 10;
            int sayi2 = 20;

            sayi1 = sayi2;

            sayi2 = 100;

            Console.WriteLine("Sayı 1: " + sayi1);

            int[] sayilar1 = new int[] { 1, 2, 3 };
            int[] sayilar2 = new int[] { 10, 20, 30 };

            sayilar1 = sayilar2;
            sayilar2[0] = 1000;

            Console.WriteLine("Sayılar1[0] = " + sayilar1[0]);

            Person person1 = new Person();
            Person person2 = new Person();

            person1.FirstName = "Engin";

            person2 = person1;

            person1.FirstName = "Derin";

            Console.WriteLine(person2.FirstName);

            Customer customer = new Customer();
            customer.FirstName = "Salih";

            Employee employee = new Employee();
            employee.FirstName = "Veli";

            Person person3 = customer;
            customer.FirstName = "Ahmet";

            Console.WriteLine(person3.FirstName);

            //önemli
            Console.WriteLine(((Customer)person3).CredirCardNumber);

            //person class tipinde parametre gönderdiğimiz için inherit edilen sınıflardan da eleman gönderebiliriz.
            PersonManager personManager = new PersonManager();
            personManager.Add(person3);
        }
    }

    class Person {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
    }

    class Customer: Person {
        public string CredirCardNumber { get; set; }
    }
    class Employee: Person {
        public int EmployeeNumber { get; set; }
    }
    class PersonManager {
        public void Add(Person person) {
            Console.WriteLine(person.FirstName);
        }
    }
}
