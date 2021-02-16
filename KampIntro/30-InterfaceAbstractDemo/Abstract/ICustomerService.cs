using System;
using System.Collections.Generic;
using System.Text;
using _30_InterfaceAbstractDemo.Entities;

namespace _30_InterfaceAbstractDemo.Abstract {
    public interface ICustomerService {
        void Save(Customer customer);
    }
}
