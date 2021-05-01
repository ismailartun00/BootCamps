using _30_InterfaceAbstractDemo.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _30_InterfaceAbstractDemo.Abstract {
    public abstract class BaseCustomerManager : ICustomerService {
        public virtual void Save(Customer customer) {
            Console.WriteLine("Saved to db: " + customer.FirstName);
        }
    }
}
