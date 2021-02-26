using DataAccess.Abstract;
using Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;

namespace DataAccess.Concrete.InMemory
{
    public class InMemoryCarDal : ICarDal
    {
        List<Car> _cars;
        public InMemoryCarDal()
        {
            _cars = new List<Car> {
                new Car{CarId=1,BrandId=1,ColorId=1,ModelYear="2020",DailyPrice=100,Description="Audi"},
                new Car{CarId=2,BrandId=1,ColorId=1,ModelYear="2020",DailyPrice=100,Description="BMW"},
                new Car{CarId=3,BrandId=2,ColorId=2,ModelYear="2019",DailyPrice=90,Description="Opel"},
                new Car{CarId=4,BrandId=2,ColorId=2,ModelYear="2019",DailyPrice=90,Description="Toyota"},
                new Car{CarId=5,BrandId=3,ColorId=3,ModelYear="2018",DailyPrice=80,Description="Kia"},
                new Car{CarId=6,BrandId=3,ColorId=3,ModelYear="2018",DailyPrice=80,Description="Renault"},
            };
        }
        public void Add(Car car)
        {
            if (_cars.SingleOrDefault(c => c.CarId == car.CarId) == null)
            {
                _cars.Add(car);
                Console.WriteLine(car.CarId+" numaralı araç listeye eklendi");
            }
            else
            {
                Console.WriteLine("Farklı CarId numarası kullanınız!!");
            }            
        }

        public void Delete(Car car)
        {
            Car carToDelete = _cars.SingleOrDefault(c => c.CarId == car.CarId);
            _cars.Remove(carToDelete);
        }
        public void Update(Car car)
        {
            //Gönderdiğim ürün ıd'sine  sahip olan listedeki  ürünü bul
            Car carToUpdate =_cars.SingleOrDefault(c => c.CarId == car.CarId);//Tek bir eleman bulmaya yarar
            carToUpdate.BrandId = car.BrandId;
            carToUpdate.ColorId = car.ColorId;
            carToUpdate.ModelYear = car.ModelYear;
            carToUpdate.DailyPrice = car.DailyPrice;
            carToUpdate.Description = car.Description;
        }

        public List<Car> GetAll()
        {
            return _cars;
        }

        public Car GetById(int id)
        {
            return _cars.SingleOrDefault(c => c.CarId == id);
        }

        public List<Car> GetAll(Expression<Func<Car, bool>> filter = null)
        {
            throw new NotImplementedException();
        }
    }
}
