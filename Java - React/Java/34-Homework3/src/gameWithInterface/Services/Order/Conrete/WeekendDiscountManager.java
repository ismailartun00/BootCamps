package gameWithInterface.Services.Order.Conrete;

import gameWithInterface.Services.Order.Abstract.DiscountService;

public class WeekendDiscountManager implements DiscountService {

	@Override
	public void discount() {
		System.out.println("Weekend discount applied");
	}
	
}
