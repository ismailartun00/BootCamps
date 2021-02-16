using _30_InterfaceAbstractDemo.Abstract;
using _30_InterfaceAbstractDemo.Entities;
using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using System.Threading.Tasks;

namespace _30_InterfaceAbstractDemo.Concrete {
    public class StarbucksCustomerManeger : BaseCustomerManager {
        private ICustomerCheckService _customerCheckService;

        public StarbucksCustomerManeger(ICustomerCheckService customerCheckService) {
            _customerCheckService = customerCheckService;
        }

        public override void Save(Customer customer) {
            if (_customerCheckService.CheckIfRealPerson(customer)) {
                base.Save(customer);
            }
            else {
                Console.WriteLine("Not a valid person: " + customer.FirstName);
            }
        }
    }
}
