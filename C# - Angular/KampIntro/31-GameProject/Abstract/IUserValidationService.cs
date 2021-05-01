using _31_GameProject.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _31_GameProject.Abstract {
    interface IUserValidationService {
        bool IsRealPerson(User user);
    }
}
