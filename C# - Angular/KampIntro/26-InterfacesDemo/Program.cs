using System;

namespace _26_InterfacesDemo {
    class Program {
        static void Main(string[] args) {
            IWorker[] workers = new IWorker[3]
            {
                new Manager(),
                new Worker(),
                new Robot()
            };

            foreach (var worker in workers) {
                worker.Work();
            }

            IEat[] eats = new IEat[2]
            {
                new Worker(),
                new Manager()
            };

            foreach (var eat in eats) {
                eat.Eat();
            }
        }
    }
    interface IWorker {
        void Work();
    }

    interface IEat {
        void Eat();
    }
    interface ISalary {
        void GetSalary();
    }
    class Manager : IWorker, IEat, ISalary {
        public void Work() {
            Console.WriteLine("Manager works");
        }
        public void Eat() {
            Console.WriteLine("Manager eats");
        }
        public void GetSalary() {
            Console.WriteLine("Manager gets salary");
        }
    }
    class Worker : IWorker, IEat, ISalary {
        public void Work() {
            Console.WriteLine("Worker works");
        }
        public void Eat() {
            Console.WriteLine("Worker eats");
        }
        public void GetSalary() {
            Console.WriteLine("Worker gets salary");
        }
    }
    class Robot : IWorker {
        public void Work() {
            Console.WriteLine("Robot works");
        }
    }
}
