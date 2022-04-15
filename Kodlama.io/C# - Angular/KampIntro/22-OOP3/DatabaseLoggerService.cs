using System;
using System.Collections.Generic;
using System.Text;

namespace _22_OOP3 {
    class DatabaseLoggerService : ILoggerService {
        public void Log() {
            Console.WriteLine("Veritabanına loglandı.");
        }
    }
}
