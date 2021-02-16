using System;
using System.Collections.Generic;
using System.Text;

namespace _31_GameProject.Entities {
	public class Sale {
		public int SaleId { get; set; }
		public string UserFirstName { get; set; }
		public string UserLastName { get; set; }
		public string GameName { get; set; }
		public string CampaignName { get; set; }
		public double TotalPrice { get; set; }
	}
}
