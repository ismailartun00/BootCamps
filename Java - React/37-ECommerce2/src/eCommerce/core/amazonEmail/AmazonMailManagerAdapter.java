package eCommerce.core.amazonEmail;

import eCommerce.amazonMail.AmazonMailManager;
import eCommerce.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService {
	private AmazonMailManager amazonMailManager;

	public AmazonMailManagerAdapter() {
		this.amazonMailManager = new AmazonMailManager();
	}

	@Override
	public void send(String email, String message) {
		amazonMailManager.send(email, message);
	}

}
