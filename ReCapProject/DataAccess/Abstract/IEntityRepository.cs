using Entities;
using System;
using System.Collections.Generic;
using System.Linq.Expressions;
using System.Text;

namespace DataAccess.Abstract
{
    //generic constraint- generic kısıt
    //class:referans tip olabilir
    //IEntity:IEntity olabilir veya IEntity implemente eden bir nesne olabilir
    //new(): new'lenebilir olmalı
    //NuGet
    public interface IEntityRepository<T> where T:class,IEntity,new()//<T> bir referans tip olmalı ve <T> ya IEntity olabilir ya IEntityden implemente olan class
    {
        List<T> GetAll(Expression<Func<T,bool>> filter=null);//filtre=null filtrede verilmeyebilir demek
        void Add(T entity);
        void Delete(T entity);
        void Update(T entity);
        //Car GetById(int id); kullanımına gerek kalmadı
    }
}
