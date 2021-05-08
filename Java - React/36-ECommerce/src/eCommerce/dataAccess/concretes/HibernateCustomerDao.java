package eCommerce.dataAccess.concretes;

import java.util.List;

import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile eklendi : " + customer.getFirstName());		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Hibernate ile güncellendi : " + customer.getFirstName());		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hibernate ile silindi : " + customer.getFirstName());		
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
