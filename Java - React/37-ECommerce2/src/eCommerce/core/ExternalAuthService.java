package eCommerce.core;

import eCommerce.entities.concretes.LogInDto;

public interface ExternalAuthService {
	void register(String email);
	boolean userExist(String email);
	void logIn(LogInDto dto);
}
