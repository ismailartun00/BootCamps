package gameWithInterface;

import java.util.Date;

import gameWithInterface.Adapters.Concrete.MernisServiceAdapter;
import gameWithInterface.Entities.Concrete.User;
import gameWithInterface.Services.User.Abstract.BaseUserManager;
import gameWithInterface.Services.User.Concrete.GuestUserManager;
import gameWithInterface.Services.User.Concrete.RealUserManager;
import gameWithInterface.Services.Order.Conrete.OrderManager;
import gameWithInterface.Services.Order.Conrete.SpringDiscountManager;
import gameWithInterface.Services.Order.Conrete.WeekendDiscountManager;

public class Main {

	public static void main(String[] args) {
		BaseUserManager realUserManager = new RealUserManager(new MernisServiceAdapter());
		BaseUserManager guestUserManager = new GuestUserManager();
		
		OrderManager springOderderManager = new OrderManager(new SpringDiscountManager());
		OrderManager weekendOderderManager = new OrderManager(new WeekendDiscountManager());
		
		
		User ismail = new User();
		ismail.setId(1);
		ismail.setNationalityId("27298649254");
		ismail.setUserName("ismailartun00");
		ismail.setFirstName("Ýsmail");
		ismail.setLastName("Artun");
		ismail.setDateOfBirth(new Date(1996, 10, 28));
		ismail.setEmail("ismailartun00@gmail.com");
		
		User engin = new User(2, "engindemirog", "engindemirog@gmail.com", "Engin", "Demiroð", new Date(1985, 1, 6), "28861499108" );
		
		User fatma = new User(3, "fatmabeles", "fatmabeles@gmail.com", "Fatma", "Beleþ", new Date(1995, 12, 20), "12345612345" );
		
		User ayse = new User(4, "aysecikan", "aysecikan@gmail.com", "Ayþe", "Çýkan", new Date(1993, 8, 15), "11111111111");
		
		realUserManager.add(ismail);
		realUserManager.add(engin);
		realUserManager.add(fatma);
		guestUserManager.add(ayse);
		System.out.println();
		
		springOderderManager.create(ismail);
		System.out.println();
		
		weekendOderderManager.create(engin);
		System.out.println();
	}

}
