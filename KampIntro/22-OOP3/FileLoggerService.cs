using System;

namespace _22_OOP3 {
    class FileLoggerService : ILoggerService {
        public void Log() {
            Console.WriteLine("Dosyaya loglandı.");
        }
    }
}
