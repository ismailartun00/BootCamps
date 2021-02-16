using DataAccess.Abstract;
using Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DataAccess.Concrete.InMemory {
    public class InMemoryProductDal : IProductDal {
        //naming commention
        List<Product> _products;
        public InMemoryProductDal() {
            _products = new List<Product> {
                new Product{ProductId = 1, CategoryId = 1, ProductName = "Bardak", UnitsPrice = 15, UnitsInStock = 15},
                new Product{ProductId = 2, CategoryId = 1, ProductName = "Kamera", UnitsPrice = 500, UnitsInStock = 3},
                new Product{ProductId = 3, CategoryId = 2, ProductName = "Telefon", UnitsPrice = 1500, UnitsInStock = 2},
                new Product{ProductId = 4, CategoryId = 2, ProductName = "Klavye", UnitsPrice = 150, UnitsInStock = 65},
                new Product{ProductId = 5, CategoryId = 2, ProductName = "Fare", UnitsPrice = 85, UnitsInStock = 1}
            };
        }
        public void Add(Product product) {
            _products.Add(product);
        }

        public void Delete(Product product) {
            //eski yöntem
            /*Product productToDelete = null;
            foreach (var p in _products) {
                if (product.ProductId == p.ProductId) {
                    productToDelete = p;
                }
            }
            _products.Remove(productToDelete);*/

            //LINQ - Language Integrated Query
            Product productToDelete = _products.SingleOrDefault(p=>p.ProductId == product.ProductId);
            //Product productToDelete = _products.FirstOrDefault(p => p.ProductId == product.ProductId);
            //Product productToDelete = _products.First(p => p.ProductId == product.ProductId);
            _products.Remove(productToDelete);
        }

        public List<Product> GetAll() {
            return _products;
        }

        public List<Product> GetAllByCategory(int categoryId) {
            return _products.Where(p => p.CategoryId == categoryId).ToList();
        }

        public void Update(Product product) {
            //gönderdiğim ürün id'sine sahip olan listedeki ürünü bul
            Product productToUpdate = _products.SingleOrDefault(p => p.ProductId == product.ProductId);
            productToUpdate.ProductName = product.ProductName;
            productToUpdate.CategoryId = product.CategoryId;
            productToUpdate.UnitsPrice = product.UnitsPrice;
            productToUpdate.UnitsInStock = product.UnitsInStock;
        }
    }
}
