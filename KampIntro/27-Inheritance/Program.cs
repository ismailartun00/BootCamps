using System;

namespace _27_Inheritance {
    class Program {
        static void Main(string[] args) {
            Person[] persons = new Person[3]
            {
                new Customer{FirstName = "Engin"},
                new Student{FirstName = "Derin"},
                new Person{FirstName = "Salih"}
            };
            foreach (var person in persons) {
                Console.WriteLine(person.FirstName);
            }
        }
    }

    class Person {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
    }

    interface IPerson {

    }

    //class'lar sadece bir class inherit edebilir fakat birden çok interface inherit edebilir
    //inherit edilirken önce class daha sonra interface'ler yazılır.
    class Customer : Person, IPerson {
        public string City { get; set; }
    }
    class Student : Person {
        public string Department { get; set; }
    }
}
