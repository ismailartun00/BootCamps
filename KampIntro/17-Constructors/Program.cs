using System;

namespace _17_Constructors {
    class Program {
        static void Main(string[] args) {
            Customer customer1 = new Customer() { Id = 1, FirstName = "Engin", LastName = "Demiroğ", City = "Ankara" };
            Customer customer2 = new Customer(2, "Derin", "Demiroğ", "Ankara");
        }
    }
    class Customer {
        public Customer() { }
        public Customer(int id, string firstName, string lastName, string city) {
            Id = id;
            FirstName = firstName;
            LastName = lastName;
            City = city;
        }
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string City { get; set; }
    }
}
