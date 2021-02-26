using DataAccess.Abstract;
using Entities.Concrete;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;

namespace DataAccess.Concrete.EntityFramework
{
    public class EfCarDal : ICarDal
    {
        public void Add(Car entity)
        {
            // IDısposable pattern implemantation of c#
            //using bittiği anda carbage collectore buraları topla belleği temizle
            using (ReCapContext context =new ReCapContext())
            {
                //alanları aynı bir car gönderilse bile listeden silmeye çalışsan bile silemezsin çünkü referansına ulaşman gerekir.
                var addedEntity = context.Entry(entity);// git veri kaynağından metoda gönderilen entity Car dan bir tane nesneye eşleştir.
                addedEntity.State = EntityState.Added; //gelen referans aslında eklenecek bir nesne
                context.SaveChanges();//ve şimdi ekle .bütün işlemleri gerçekleştirir.
            }
        }

        public void Delete(Car entity)
        {
            using (ReCapContext context =new ReCapContext())
            {
                var deletedEntity = context.Entry(entity);
                deletedEntity.State = EntityState.Deleted; 
                context.SaveChanges();
            }
            
        }

        public List<Car> GetAll(Expression<Func<Car, bool>> filter = null)
        {
            using (ReCapContext context=new ReCapContext())
            {
                return filter == null
                    ? context.Set<Car>().ToList()
                    : context.Set<Car>().Where(filter).ToList();
            }
        }

        public void Update(Car entity)
        {
            using (ReCapContext context = new ReCapContext())
            {
                var updatedEntity = context.Entry(entity);
                updatedEntity.State = EntityState.Modified;
                context.SaveChanges();
            }
        }
    }
}
