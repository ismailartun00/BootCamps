package eCommerce;

import eCommerce.business.abstracts.CustomerService;
import eCommerce.business.concretes.CustomerManager;
import eCommerce.dataAccess.concretes.HibernateCustomerDao;
import eCommerce.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao());
		
		Customer customer1 = new Customer("engin", "demirog", "engindemirog@gmnail.com", "123456");
		Customer customer2 = new Customer("ismail", "artun", "ismailartun00@gmnail.com", ".DikYuru25");
		Customer customer3 = new Customer("ayse", "cikan", "aysecikan@gmnail.com", "123456");
		Customer customer4 = new Customer("fatma", "demir", "fatmademir@gmnail.com", "123456");
		Customer customer5 = new Customer("a", "ol", "ahmetolmez@gmnail.com", "123456");
		
		customerService.add(customer1);
		customerService.add(customer2);
		customerService.add(customer3);
		customerService.add(customer4);
		customerService.add(customer5);
		
		customerService.logIn("engindemirog@gmnail.com", "123456");
	}

}
