using Entities.Concrete;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Text;

namespace DataAccess.Concrete.EntityFramework
{
    //Context : Db tabloları ile proje classlarını bağlamak
    public class ReCapContext:DbContext
    {
        //Bu metod projenin hangi veritabanı ile ilişkili olduğunu belirteceğimiz yerdir.
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            //normalde gerçel sistemlerde optionsBuilder.UseSqlServer(@"175.15.44.85") şeklinde uzak sunucuya bağlanılır
            //Trusted_Connection=true --kullanıcı adı ve şifre gerektirmeden 
            //büyük küçük yazmak farketmez case insensitivedir.
            optionsBuilder.UseSqlServer(@"Server=(localdb)\MSSQLLocalDB;Database=RentACar;Trusted_Connection=true");
        }

        //veritabanı bağlatısı sağlandıktan sonra hangi nesnenin hangi nesneye karşılık geldiğini
        //DBSET<> nesnesi ile belirteceğiz
        public DbSet<Car> Cars { get; set; }
        public DbSet<Color> Colors { get; set; }
        public DbSet<Brand> Brands { get; set; }

    }
}
