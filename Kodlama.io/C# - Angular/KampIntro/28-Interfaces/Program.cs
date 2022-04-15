using System;

namespace _28_Interfaces {
    class Program {
        static void Main(string[] args) {
            //IPersonManager customerManager = new CustomerManager();
            //customerManager.Add();
            //IPersonManager employeeManager = new EmployeeManager();
            //employeeManager.Add();

            ProjectManager projectManager = new ProjectManager();
            projectManager.Add(new InternManager());
        }
    }
    interface IPersonManager {
        //Unimplemented Operation - Tamamlanmamış Operasyon
        void Add();     //sign - imza
        void Update();
    }
    /*class PersonManager {
        //Implemented Operation - Tamamlanmış Operasyon
        public void Add() {
            Console.WriteLine("Eklendi");
        }
    }*/

    //inherits - class ----------- implements - interface
    class CustomerManager : IPersonManager {
        public void Add() {
            //müşteri ekleme kodları
            Console.WriteLine("Müşteri Eklendi");
        }

        public void Update() {
            Console.WriteLine("Müşteri güncellendi");
        }
    }

    class EmployeeManager : IPersonManager {
        public void Add() {
            //personel ekleme kodları
            Console.WriteLine("Personel Eklendi");
        }
        public void Update() {
            Console.WriteLine("Personel güncellendi");
        }
    }

    class InternManager : IPersonManager {
        public void Add() {
            //stajyer ekleme kodları
            Console.WriteLine("Stajyer Eklendi");
        }
        public void Update() {
            Console.WriteLine("Stajyer güncellendi");
        }
    }

    class ProjectManager {
        public void Add(IPersonManager personManager) {
            personManager.Add();
        }
    }
}
