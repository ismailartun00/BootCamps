package eCommerce.business.concretes;

import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.utils.Utils;
import eCommerce.entities.concretes.LogInDto;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {
	private UserService userService;

	public AuthManager() {

	}

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && userExist(user.getEMail()) == false
				&& Utils.emailValidate(user.getEMail())) {

			userService.add(user);

		} else {
			System.out.println("Kayıt başarısız");
		}
	}

	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 20) {
			User exitsUser = userService.get(user.getEMail());
			exitsUser.setVerify(true);

			userService.update(exitsUser);
			System.out.println("Doğrulandı");
		} else {
			System.out.println("Doğrulanamadı");
		}
	}

	@Override
	public boolean userExist(String email) {
		User user = userService.get(email);

		if (user == null) {
			return false;
		} else {
			System.out.println("Email mevcut." + email);
			return true;
		}
	}

	@Override
	public void logIn(LogInDto dto) {
		User user = userService.get(dto.getEMail());

		if (user != null && user.getPassword().equals(dto.getPassword())) {
			
			System.out.println("Başarıyla giriş yaptınız.");

		}else {
			System.out.println("Kullanıcı adı veya şifre yanlış.");
		}
		

	}

	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEMail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}

	public boolean passwordValidate(String password) {

		if (password.length() >= 6) {
			return true;
		} else {
			System.out.println("Şifreniz en az 6 karakter olmalı");
			return false;
		}
	}
}
