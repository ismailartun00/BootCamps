using _30_InterfaceAbstractDemo.Abstract;
using _30_InterfaceAbstractDemo.Entities;
using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;

namespace _30_InterfaceAbstractDemo.Concrete {
    public class CustomerCheckManager : ICustomerCheckService {
        public bool CheckIfRealPerson(Customer customer) {
            return true;
        }
    }
}
