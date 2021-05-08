package eCommerce;

import java.util.List;

import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.amazonEmail.AmazonMailManagerAdapter;
import eCommerce.core.googleEmail.GoogleMailManagerAdapter;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		InMemoryUserDao inMemoryUserDao=new InMemoryUserDao();
		AuthManager authManager=new AuthManager(new UserManager(inMemoryUserDao, 
				new AmazonMailManagerAdapter()));
			
		User enes=new User(2,"Enes","celep","enes@gmail.com","123456",true);
		User zafer=new User(2,"Enes","celep","zafergmail.com","123456",true);
		
		
		authManager.register(zafer);
		
		UserManager userManager=new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter());
		//userManager.update(enes);
		//userManager.delete(3);
		userManager.getAll();
	}

}
