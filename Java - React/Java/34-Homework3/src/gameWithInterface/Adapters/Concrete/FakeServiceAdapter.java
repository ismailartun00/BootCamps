package gameWithInterface.Adapters.Concrete;

import gameWithInterface.Entities.Concrete.User;
import gameWithInterface.Adapters.Abstract.UserVerificationService;

public class FakeServiceAdapter implements UserVerificationService {

	@Override
	public boolean verify(User user) {
		System.out.println("Verification successful");
		return true;
	}
}
