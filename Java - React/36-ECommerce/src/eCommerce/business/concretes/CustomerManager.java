package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eCommerce.business.abstracts.CustomerService;
import eCommerce.core.abstracts.LoggerService;
import eCommerce.dataAccess.abstracts.CustomerDao;
import eCommerce.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	
	private CustomerDao customerDao;
	private LoggerService loggerService;
	private ArrayList<String> emailList = new ArrayList<String>();
	
	public static boolean isEmailValid(String email) {
		final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
		return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isEmailValidOnClick() {
		return true;
	}
	
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void add(Customer customer) {
		if(emailList.contains(customer.getEmail())) {
			System.out.println("Bu email adresiyle baska bir kullanici kayitlidir " + customer.getEmail());
			return;
		}
		if(customer.getPassword().length()<5) {
			System.out.println("Parola en az 6 karakter olmalidir.");
			return;
		}
		if((customer.getFirstName().length())<2 || (customer.getLastName().length()<2)){
			System.out.println("First Name ve Last Name alani en az iki karakter olmalidir.");
			return;
		}
		if(isEmailValid(customer.getEmail())!=true) {
			System.out.println("Email adresinizi dogru girin");
		}
		if(isEmailValidOnClick()!= true) {
			System.out.println("Lütfen email adresinizi dogrulayin.");
			return;
		}else {
			emailList.add(customer.getEmail());
		}
		customerDao.add(customer);
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logIn(String email, String password) {
		// TODO Auto-generated method stub
		
	}

}
