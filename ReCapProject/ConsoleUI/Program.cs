using Business.Concrete;
using DataAccess.Concrete.InMemory;
using System;

namespace ConsoleUI {
    class Program {
        static void Main(string[] args) {
            CarManager carManager = new CarManager(new InMemoryCarDal());
            Console.WriteLine("Arabalar Hakkındaki Bilgiler");
            Console.WriteLine();
            foreach (var car in carManager.GetAll()) {
                Console.WriteLine("\t" + car.Description);
            }
        }
    }
}
