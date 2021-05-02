package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
