package gameWithInterface.Services.Order.Conrete;

import gameWithInterface.Services.Order.Abstract.DiscountService;

public class SpringDiscountManager implements DiscountService {

	@Override
	public void discount() {
		System.out.println("Spring discount applied");
	}

}
