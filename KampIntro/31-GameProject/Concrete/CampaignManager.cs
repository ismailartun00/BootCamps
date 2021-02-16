using _31_GameProject.Abstract;
using _31_GameProject.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _31_GameProject.Concrete {
	public class CampaignManager : ICampaignService {
		public void Add(Campaign campaign) {
			Console.WriteLine("Kampanya Eklendi : " + campaign.CampaignName);
		}
		public void Delete(Campaign campaign) {
			Console.WriteLine("Kampanya Silindi : " + campaign.CampaignName);
		}
		public void Update(Campaign campaign) {
			Console.WriteLine("Kampanya Güncellendi : " + campaign.CampaignName);
		}
	}
}
