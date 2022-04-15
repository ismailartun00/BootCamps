using _31_GameProject.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _31_GameProject.Abstract {
    interface IGameService {
        void Add(Game game);
        void Delete(Game game);
        void Update(Game game);
    }
}
