using DataAccess.Abstract;
using Entities.Concrete;
using Entities.DTOs;
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
            _cars = new List<Car>
            {
                new Car { CarId=1, BrandId=10, ColorId=256, ModelYear=2018, DailyPrice=800, Description="VW Jetta 1.6 TDI Comfortline DSG"},
                new Car { CarId=2, BrandId=20, ColorId=155, ModelYear=2019, DailyPrice=1200, Description="VW Passat 1.6 TDI Comfortline DSG"},
                new Car { CarId=3, BrandId=30, ColorId=350, ModelYear=2017, DailyPrice=1000, Description="VW Tiguan 1.5 TSI Comfortline DSG"},
                new Car { CarId=4, BrandId=40, ColorId=120, ModelYear=2020, DailyPrice=2000, Description="VW T-Roc 1.5 TSI Highline DSG"},
                new Car { CarId=5, BrandId=50, ColorId=450, ModelYear=2016, DailyPrice=700, Description="VW Golf 1.6 TDI Highline DSG"}
            };


        }
        public void Add(Car car)
        {
            _cars.Add(car);
        }

        public void Delete(Car car)
        {
            Car CarToDelete = _cars.SingleOrDefault(c => c.CarId == car.CarId);
            _cars.Remove(CarToDelete);
        }

        public List<Car> GetAll()
        {
            return _cars;
        }

        public void Update(Car car)
        {
            Car carToUpdate = _cars.SingleOrDefault(c => c.CarId == car.CarId);
            carToUpdate.CarId = car.CarId;
            carToUpdate.BrandId = car.BrandId;
            carToUpdate.ColorId = car.ColorId;
            carToUpdate.ModelYear = car.ModelYear;
            carToUpdate.DailyPrice = car.DailyPrice;
            carToUpdate.Description = car.Description;

        }

        public List<Car> GetAllByBrand(int Id)
        {
            return _cars.Where(c => c.CarId == Id).ToList();
        }

        public List<Car> GetAll(Expression<Func<Car, bool>> filter = null)
        {
            throw new NotImplementedException();
        }

        public Car Get(Expression<Func<Car, bool>> filter)
        {
            throw new NotImplementedException();
        }

        public List<CarDetailDto> GetCarDetails()
        {
            throw new NotImplementedException();
        }
    }
}