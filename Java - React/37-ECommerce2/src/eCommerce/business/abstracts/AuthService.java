package eCommerce.business.abstracts;

import eCommerce.entities.concretes.LogInDto;
import eCommerce.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user, String token);
	boolean userExist(String eMail);
	void logIn(LogInDto dto);
	
}
