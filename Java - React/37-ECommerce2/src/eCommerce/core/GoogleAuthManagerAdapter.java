package eCommerce.core;

import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.LogInDto;
import eCommerce.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService{
private UserService userService;
	

	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(String email) {
		if(userExist(email)==false) {
			userService.add(null);
		}
		else {
			User user =userService.get(email);
			
			LogInDto dto=new LogInDto();
			dto.setEMail(user.getEMail());
			dto.setPassword(user.getPassword());
			
			logIn(dto);
		}
		
	}

	@Override
	public boolean userExist(String eMail) {
		if(userService.get(eMail)!=null)
		{
			return true;
			
		}
		return false;
	}

	@Override
	public void logIn(LogInDto dto) {
		if(dto!=null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Baþarýyla Giriþ yaptýnýz.");
		}
		else {
			System.out.println("Kullanýcý adý veya þifre yanlýþ");
		}
		
		
		
	}

}
