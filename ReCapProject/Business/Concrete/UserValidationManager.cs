using Business.Abstract;
using Entities;
using Entities.Concrete;
using System;
using System.Collections.Generic;
using System.Text;

namespace Business.Concrete
{
    public class UserValidationManager : IUserValidationService
    {
        public bool Validate(Car car)
        {
            return NameValidate(car) && DailyPriceValidate(car);
        }

        private bool DailyPriceValidate(Car car)
        {
            if (car.DailyPrice > 0)
            {
                return true;
            }
            else
            {
                Console.WriteLine("Aracın günlük kiralama ücreti 0'dan büyük olmalıdır");
                return false;
            }
        }

        private bool NameValidate(Car car)
        {
            if (car.Description.Length >= 2)
            {
                return true;
            }
            else
            {
                Console.WriteLine("Araç Adı en az 2 karakter olmalıdır");
                return false;
            }
        }
    }
}
