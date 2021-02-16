using _31_GameProject.Entities;
using _31_GameProject.Concrete;
using _31_GameProject.Abstract;
using System;

namespace _31_GameProject {
    class Program {
		static void Main(string[] args) {
			User user1 = new User() { UserId = 1, UserFirstName = "İsmail", UserLastName = "Artun", UserBirthYear = 1992, UserTcNo = "1234567890" };
			User user2 = new User() { UserId = 2, UserFirstName = "Engin", UserLastName = "Demiroğ", UserBirthYear = 1988, UserTcNo = "9876543210" };
			User user3 = new User() { UserId = 3, UserFirstName = "Ali", UserLastName = "Sarıoğlu", UserBirthYear = 2000, UserTcNo = "6543219870" };

			Game game1 = new Game() { GameId = 1, GameName = "Football Manager 2021", GamePrice = 150 };
			Game game2 = new Game() { GameId = 2, GameName = "PES 2021", GamePrice = 200 };
			Game game3 = new Game() { GameId = 3, GameName = "FIFA 2021", GamePrice = 250 };

			Campaign campaign1 = new Campaign() { CampaignId = 1, CampaignName = "Black Friday", CampaignDiscount = 50 };
			Campaign campaign2 = new Campaign() { CampaignId = 2, CampaignName = "Yeni Yıl İndirimi", CampaignDiscount = 40 };

			Sale sale1 = new Sale() { SaleId = 1, UserFirstName = "İsmail", UserLastName = "Artun", GameName = "Football Manager 2021", CampaignName = "Black Friday", TotalPrice = (game1.GamePrice) * 0.5 };
			Sale sale2 = new Sale() { SaleId = 2, UserFirstName = "İsmail", UserLastName = "Artun", GameName = "PES 2021", CampaignName = "Yeni Yıl İndirimi", TotalPrice = (game2.GamePrice) * 0.6 };
			Sale sale3 = new Sale() { SaleId = 3, UserFirstName = "İsmail", UserLastName = "Artun", GameName = "FIFA 2021", CampaignName = "Black Friday", TotalPrice = (game1.GamePrice) * 0.5 };

			UserValidationManager userValidationManager = new UserValidationManager();
			UserManager userManager = new UserManager(userValidationManager);
			GameManager gameManager = new GameManager();
			CampaignManager campaignManager = new CampaignManager();
			SaleManager saleManager = new SaleManager();

			campaignManager.Add(campaign1);
			campaignManager.Add(campaign2);

			gameManager.Add(game1);
			gameManager.Add(game2);
			gameManager.Add(game3);

			userManager.Add(user1);
			userManager.Add(user2);
			userManager.Add(user3);

			saleManager.Sale(sale1);
			saleManager.Sale(sale2);
			saleManager.Sale(sale3);


		}
	}
}
