using System;
using System.Collections.Generic;
using System.Text;

namespace _13_OOP1 {
    public class ProductManager {
        public void Add(Product product) {
            Console.WriteLine(product.ProductName + " eklendi.");
        }
        public void Update(Product product, string newName) {
            product.ProductName = newName;
            Console.WriteLine(product.ProductName + " güncellendi.");
        }
    }
}
