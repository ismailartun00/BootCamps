package gameWithInterface.Services.Order.Conrete;

import gameWithInterface.Entities.Concrete.User;
import gameWithInterface.Services.Order.Abstract.DiscountService;
import gameWithInterface.Services.Order.Abstract.OrderService;

public class OrderManager implements OrderService {
	
	private DiscountService discountService;
	
	public OrderManager() {
		
	}
	
	public OrderManager(DiscountService discountService) {
		this.discountService = discountService;
	}

	@Override
	public void create(User user) {
		discountService.discount();
		System.out.println(user.getUserName() + " order has been created");
	}
	
}
