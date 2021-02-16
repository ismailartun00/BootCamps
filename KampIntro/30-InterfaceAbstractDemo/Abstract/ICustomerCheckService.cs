using _30_InterfaceAbstractDemo.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _30_InterfaceAbstractDemo.Abstract {
    public interface ICustomerCheckService {
        bool CheckIfRealPerson(Customer customer);
    }
}
