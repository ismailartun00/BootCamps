using DataAccess.Abstract;
using Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace DataAccess.Concrete.InMemory {
    public class InMemoryCarDal: ICarDal {
        List<Car> _cars;
        public InMemoryCarDal() {
            _cars = new List<Car> {
                new Car{Id = 1, BrandId = 1, ColorId = 1, DailyPrice = 150, ModelYear = "2005", Description = "BMW"},
                new Car{Id = 2, BrandId = 1, ColorId = 2, DailyPrice = 250, ModelYear = "2009", Description = "Audi"},
                new Car{Id = 3, BrandId = 2, ColorId = 3, DailyPrice = 350, ModelYear = "2013", Description = "Ford"},
                new Car{Id = 4, BrandId = 2, ColorId = 4, DailyPrice = 450, ModelYear = "2017", Description = "Fiat"},
                new Car{Id = 5, BrandId = 3, ColorId = 5, DailyPrice = 550, ModelYear = "2021", Description = "Mercedes"}
            };
        }
        public void Add(Car car) {
            _cars.Add(car);
        }

        public void Delete(Car car) {
            _cars.Remove(_cars.SingleOrDefault(c => c.Id == car.Id));
        }

        public List<Car> GetAll() {
            return _cars;
        }

        public List<Car> GetById(int id) {
            return (_cars.Where(c => c.Id == id)).ToList() ;
        }

        public void Update(Car car) {
            var carToUpdate = _cars.SingleOrDefault(c => c.Id == car.Id);
            carToUpdate.ColorId = car.ColorId;
            carToUpdate.BrandId = car.BrandId;
            carToUpdate.DailyPrice = car.DailyPrice;
            carToUpdate.ModelYear = car.ModelYear;
            carToUpdate.Description = car.Description;
        }
    }
}
