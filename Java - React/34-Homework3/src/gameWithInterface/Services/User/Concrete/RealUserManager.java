package gameWithInterface.Services.User.Concrete;

import gameWithInterface.Services.User.Abstract.BaseUserManager;
import gameWithInterface.Adapters.Abstract.UserVerificationService;
import gameWithInterface.Entities.Concrete.User;

public class RealUserManager extends BaseUserManager {
	private UserVerificationService userVerificationService;
	
	public RealUserManager(UserVerificationService userVerificationService) {
		this.userVerificationService = userVerificationService;
	}
	
	@Override
	public void add(User user) {
		if(userVerificationService.verify(user)){
			super.add(user);
		}else {
			System.out.println(user.getUserName() + " didn't add");
		}
	}
}
