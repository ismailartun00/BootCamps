package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	List<Customer> getAll();
	void logIn(String email, String password);
}
