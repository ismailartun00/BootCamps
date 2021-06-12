package interfaceAbstractDemo;

import java.util.Date;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.CustomerCheckManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;
import interfaceAbstractDemo.Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {

		Customer realCustomer1 = new Customer(1, "İsmail", "Artun", new Date(1996, 10, 28), "27298649254");
		Customer realCustomer2 = new Customer(2, "Engin", "Demiroğ", new Date(1985, 1, 6), "28861499108");
		Customer fakeCustomer1 = new Customer(3, "Engin", "Demirog", new Date(1989, 2, 11), "12345678901");

		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(realCustomer1);

		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(realCustomer2);
		starbucksCustomerManager.save(fakeCustomer1);

	}

}

/*
 * Senaryo Kahve dükkanları için müşteri yönetimi yapan bir sistem yazmak
 * istiyoruz. Starbucks ve Nero Firması için çalışıyoruz. İki firma da
 * müşterilerini veri tabanına kaydetmek istiyor. Starbucks müşterileri
 * kaydederken, mutlaka mernis doğrulaması istiyor. Nero müşterileri kaydederken
 * böyle bir şey istemiyor. Starbucks müşteriler için her kahve alımında yıldız
 * kazandırmak istiyor.
 */

/*
 * Mernis Sistemini Eklemne
 * 
 * - Projeye sag tikla new -> other -> web diye arat -> web service client -
 * Service definition için link (sonunda wsdl parametresi gecmek önemli) :
 * https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?wsdl - Finish de
 * ekleyecektir.
 * 
 * Lakin benim gibi javaSE-15 ile compile ediyor ise projeniz eklenen servis
 * hata verecektir. Bunun için projeye sag tiklayin properties -> Java Compiler
 * -> Use compliance from.. tikini kaldırıp -> 1.8 'i secerseniz sorunsuz
 * calışacaktir
 */