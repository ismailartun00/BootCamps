using System;
using System.Collections.Generic;
using System.Text;

namespace _23_Classes {
    class Customer {
        //Field
        //public string _firstName;

        //Property
        public int Id { get; set; }
        /*public string FirstName {
            get {
                return "Mrs." + _firstName;
            }
            set {
                _firstName = value;
            }
        }*/
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string City { get; set; }
    }
}
