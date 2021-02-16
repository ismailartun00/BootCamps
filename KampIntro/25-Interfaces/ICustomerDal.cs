using System;
using System.Collections.Generic;
using System.Text;

namespace _25_Interfaces {
    //Dal terimi genellikle veritabanı işlemlerini yaptığımız sınıflara verilir.(Insert, Update, Delete, ...)
    interface ICustomerDal {
        void Add();
        void Update();
        void Delete();
    }

    class SqlServerCustomerDal : ICustomerDal {
        public void Add() {
            Console.WriteLine("Sql Added");
        }

        public void Update() {
            Console.WriteLine("Sql Updated");
        }

        public void Delete() {
            Console.WriteLine("Sql Deleted");
        }
    }

    class OracleCustomerDal : ICustomerDal {
        public void Add() {
            Console.WriteLine("Oracle Added");
        }

        public void Update() {
            Console.WriteLine("Oracle Updated");
        }

        public void Delete() {
            Console.WriteLine("Oracle Deleted");
        }
    }
    class MySqlCustomerDal : ICustomerDal {
        public void Add() {
            Console.WriteLine("MySql Added");
        }

        public void Update() {
            Console.WriteLine("MySql Updated");
        }

        public void Delete() {
            Console.WriteLine("MySql Deleted");
        }
    }

    class CustomerManager {
        public void Add(ICustomerDal customerDal) {
            customerDal.Add();
        }
    }
}
