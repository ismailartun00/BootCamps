package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.id = 1;
		engin.firstName = "Engin";
		engin.lastName = "Demirog";
		engin.nationalIdentity = "10000000000";
		engin.customerNumber = "1234";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.id = 2;
		hepsiBurada.customerNumber = "5678";
		hepsiBurada.companyName = "HepsiBurada.com";
		hepsiBurada.taxNumber = "1323";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.id = 3;
		abc.customerNumber = "9101";
		abc.sendikaBiseyi = "belirsiz";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(engin);
		customerManager.add(hepsiBurada);
		customerManager.add(abc);
		
		System.out.println();
		
		Customer[] customers = { engin, hepsiBurada, abc};
		
		customerManager.addMultiple(customers);
	}

}
