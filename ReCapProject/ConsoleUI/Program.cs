using Business.Concrete;
using DataAccess.Concrete.EntityFramework;
using DataAccess.Concrete.InMemory;
using Entities.Concrete;
using System;

namespace ConsoleUI
{
    class Program
    {
        static void Main(string[] args)
        {
            ColorManager colorManager = new ColorManager(new EfColorDal());
            colorManager.Add(new Color { ColorName = "Sarı" });
            colorManager.Add(new Color { ColorName = "Yeşil" });

            Console.WriteLine("--Color GetAll Function Call: \n");
            foreach (var color in colorManager.GetAll())
            {
                Console.WriteLine(color.ColorName);
            }

            Console.WriteLine("***************************************\n");
            BrandManager brandManager = new BrandManager(new EfBrandDal());
            brandManager.Add(new Brand { BrandName = "Kia" });
            brandManager.Add(new Brand { BrandName = "Audi" });
            Console.WriteLine("--Brand GetAll Function Call: \n");
            foreach (var brand in brandManager.GetAll())
            {
                Console.WriteLine(brand.BrandName);
            }

            Console.WriteLine("***************************************\n");
            CarManager carManager = new CarManager(new EfCarDal(),new UserValidationManager());
            Console.WriteLine("\n-- Add Function Call: \n");
            carManager.Add(new Car {BrandId = 1, ColorId = 1, ModelYear = "2018", DailyPrice = 80, Description = "Renault" });
            carManager.Add(new Car {BrandId = 2, ColorId = 1, ModelYear = "2017", DailyPrice = 70, Description = "Alfa Romeo"});
            carManager.Add(new Car {BrandId = 2, ColorId = 1, ModelYear = "2016", DailyPrice = 70, Description = "A"});

            Console.WriteLine("--Car GetAll Function Call: \n");
            foreach (var car in carManager.GetAll())
            {
                Console.WriteLine(car.Description + " " + car.ModelYear);
            }            
           
            Console.WriteLine("***************************************\n");
            Console.WriteLine("\n--Car GetByBrandId Function Call: \n");        
            foreach (var car in carManager.GetCarsByBrandId(2))
            {
                Console.WriteLine("{0} {1} {2} {3} {4} {5}",car.CarId,car.BrandId,car.ColorId,car.ModelYear,car.DailyPrice,car.Description);
            }
           
            Console.WriteLine("***************************************\n");
            Console.WriteLine("\n--Car GetByColorId Function Call: \n");
            foreach (var car in carManager.GetCarsByColorId(1))
            {
                Console.WriteLine("{0} {1} {2} {3} {4} {5}", car.CarId, car.BrandId, car.ColorId, car.ModelYear, car.DailyPrice, car.Description);
            }
        }
    }
}
