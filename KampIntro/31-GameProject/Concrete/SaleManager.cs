using _31_GameProject.Abstract;
using _31_GameProject.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _31_GameProject.Concrete {
	public class SaleManager : ISaleService {
		public void Sale(Sale sale) {
			Console.WriteLine("----------------------------------------------------------");
			Console.WriteLine("Satılan Oyun		: " + sale.GameName);
			Console.WriteLine("Satın Alan Müşteri	: " + sale.UserFirstName + " " + sale.UserLastName);
			Console.WriteLine("Uygulanan Kampanya	: " + sale.CampaignName);
			Console.WriteLine("İndirimli Fiyat		: " + sale.TotalPrice);
			Console.WriteLine("----------------------------------------------------------");
		}
	}
}
