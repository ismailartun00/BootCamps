using Entities.Abstract;
using System;
using System.Collections.Generic;
using System.Text;

namespace Entities.Concrete {
    class Category: IEntity {
        //Çıplak Class Kalmasın Standardı
        public int CategoryId { get; set; }
        public string CategoryName { get; set; }
    }
}
