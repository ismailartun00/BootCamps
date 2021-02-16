using System;
using System.Collections.Generic;
using System.Text;
using _30_InterfaceAbstractDemo.Abstract;

namespace _30_InterfaceAbstractDemo.Entities {
    public class Customer: IEntity {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public DateTime DateOfBirth { get; set; }
        public string NationalityId { get; set; }
    }
}
