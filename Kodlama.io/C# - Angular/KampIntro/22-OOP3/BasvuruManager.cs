using System;
using System.Collections.Generic;
using System.Text;

namespace _22_OOP3 {
    class BasvuruManager {
        //Method injection
        public void BasvuruYap(IKrediManager krediManager, List<ILoggerService> loggerServices) {
            //Başvuran bilgilerini değerlendirme
            //
            krediManager.Hesapla();
            foreach (var loggerService in loggerServices) {
                loggerService.Log();
            }
        }

        public void KrediOnBilgilendirmesiYap(List<IKrediManager> krediler) {
            foreach (IKrediManager kredi in krediler) {
                kredi.Hesapla();
            }
        }
    }
}
