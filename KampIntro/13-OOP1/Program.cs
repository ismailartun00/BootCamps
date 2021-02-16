using System;

namespace _13_OOP1 {
    class Program {
        static void Main(string[] args) {
            //int, double, bool, ... değer tip
            //diziler, class, abstract class, interface class, ... referans tip

            Product product1 = new Product();
            product1.Id = 1;
            product1.CategoryId = 2;
            product1.ProductName = "Masa";
            product1.UnitPrice = 500;
            product1.UnitPrice = 3;

            Product product2 = new Product() {
                Id = 2,
                CategoryId = 5,
                UnitsInStock = 5,
                ProductName = "Kalem",
                UnitPrice = 35
            };

            //instance creation
            ProductManager productManager = new ProductManager();
            productManager.Add(product1);
            productManager.Update(product1, "Kamera");

            
        }
    }
}
