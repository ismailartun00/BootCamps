package gameWithInterface.Adapters.Abstract;

import gameWithInterface.Entities.Concrete.User;

public interface UserVerificationService {
	boolean verify(User user);
}
