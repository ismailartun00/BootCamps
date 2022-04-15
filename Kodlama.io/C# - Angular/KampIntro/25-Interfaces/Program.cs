using System;
using System.Runtime.ExceptionServices;

namespace _25_Interfaces {
    class Program {
        static void Main(string[] args) {
            //InterfacesIntro();

            //Demo();

            ICustomerDal[] customerDals = new ICustomerDal[3]
            {
                new SqlServerCustomerDal(), new OracleCustomerDal(), new MySqlCustomerDal()
            };
            foreach (var customerDal in customerDals) {
                customerDal.Add();
            }
        }

        public static void Demo() {
            CustomerManager customerManager = new CustomerManager();
            customerManager.Add(new OracleCustomerDal());
        }

        public static void InterfacesIntro() {
            //3 farklı instance oluşturma yöntemi
            //------------------------------------
            PersonManager personManager = new PersonManager();
            personManager.Add(new Customer { Id = 1, FirstName = "Engin", LastName = "Demiroğ", Address = "Ankara" });
            //------------------------------------
            Student student = new Student {
                Id = 1,
                FirstName = "Derin",
                LastName = "Demiroğ",
                Department = "Computer Sciences"
            };
            personManager.Add(student);
            //------------------------------------
            Worker worker = new Worker();
            worker.Id = 1;
            worker.FirstName = "İsmail";
            worker.LastName = "Artun";
            worker.Department = "Software Engineer";
            personManager.Add(worker);
        }
    }
    //interface, abstract: soyut.
    interface IPerson {
        int Id { get; set; }
        string FirstName { get; set; }
        string LastName { get; set; }
    }

    class Customer : IPerson {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Address { get; set; }
    }
    class Student : IPerson {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Department { get; set; }
    }
    class Worker : IPerson {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Department { get; set; }
    }

    class PersonManager {
        public void Add(IPerson person) {
            Console.WriteLine(person.FirstName);
        }
    }
}
