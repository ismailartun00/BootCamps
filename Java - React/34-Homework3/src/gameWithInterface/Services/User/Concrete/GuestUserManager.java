package gameWithInterface.Services.User.Concrete;

import gameWithInterface.Entities.Concrete.User;
import gameWithInterface.Services.User.Abstract.BaseUserManager;

public class GuestUserManager extends BaseUserManager{
	
	@Override
	public void add(User user) {
		System.out.println(user.getUserName() + " added from GuestUserManager");
	}
}
