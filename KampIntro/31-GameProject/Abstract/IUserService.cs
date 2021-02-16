using _31_GameProject.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _31_GameProject.Abstract {
    interface IUserService {
        void Add(User user);
        void Delete(User user);
        void Update(User user);
    }
}
