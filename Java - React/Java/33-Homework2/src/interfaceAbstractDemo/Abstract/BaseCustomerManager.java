package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " succesfully added to database.");
	}

}
