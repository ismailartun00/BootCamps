package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class DatabaseDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Database ile eklendi : " + customer.getFirstName());		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Database ile güncellendi : " + customer.getFirstName());		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Database ile silindi : " + customer.getFirstName());		
	}

	@Override
	public Customer get(int email) {
		
		return null;
	}

	@Override
	public List<Customer> getAll() {
		
		return null;
	}
}
