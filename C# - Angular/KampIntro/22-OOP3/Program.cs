using System;
using System.Collections.Generic;

namespace _22_OOP3 {
    class Program {
        //loglama = kimin hangi içerikleri çağırdığını öğrenmektir.
        static void Main(string[] args) {
            //IhtiyacKrediManager ihtiyacKrediManager = new IhtiyacKrediManager();
            IKrediManager ihtiyacKrediManager = new IhtiyacKrediManager();
            IKrediManager tasitKrediManager = new TasitKrediManager();
            IKrediManager konutKrediManager = new KonutKrediManager();

            ILoggerService databaseLoggerService = new DatabaseLoggerService();
            ILoggerService fileLoggerService = new FileLoggerService();
            

            BasvuruManager basvuruManager = new BasvuruManager();
            basvuruManager.BasvuruYap(tasitKrediManager, new List<ILoggerService> { fileLoggerService, databaseLoggerService, new SmsLoggerService() });
            //basvuruManager.BasvuruYap(new EsnafKredisiManager(), new SmsLoggerService());

            //Alternatif olarak burada da new yapabiliriz.
            //basvuruManager.BasvuruYap(konutKrediManager, new DatabaseLoggerService());

            List<IKrediManager> krediler = new List<IKrediManager>() {ihtiyacKrediManager, tasitKrediManager};
            //basvuruManager.KrediOnBilgilendirmesiYap(krediler);
        }
    }
}
