using Business.Abstract;
using DataAccess.Abstract;
using Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Text;

namespace Business.Concrete
{
    public class CarManager : ICarService
    {
        ICarDal _carDal;//soyut nesne ile bağlantı kuracağız
        IUserValidationService _userValidation;

        public CarManager(ICarDal carDal,IUserValidationService userValidation)
        {
            _carDal = carDal;
            _userValidation = userValidation;
        }

        public void Add(Car car)
        {
            if (_userValidation.Validate(car))
            {
                _carDal.Add(car);
            }
            else
            {
                Console.WriteLine("Bazı alanlar geçerli veri kurallarına uymadığından ekleme işlemi gerçekleştirilemedi.");
            }            
        }

        public void Delete(Car car)
        {
            _carDal.Delete(car);
        }

        public List<Car> GetAll()
        {
            return _carDal.GetAll();
        }

        public List<Car> GetCarsByBrandId(int id)
        {
            return _carDal.GetAll(p => p.BrandId == id);
        }

        public List<Car> GetCarsByColorId(int id)
        {
            return _carDal.GetAll(p => p.ColorId == id);
        }

        public void Update(Car car)
        {
            _carDal.Update(car);
        }
    }
}
