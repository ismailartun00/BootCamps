package gameWithInterface.Services.User.Abstract;

import gameWithInterface.Entities.Concrete.User;

public abstract class BaseUserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println(user.getUserName() + " added");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getUserName() + " updated");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getUserName() + " deleted");
	}

}
