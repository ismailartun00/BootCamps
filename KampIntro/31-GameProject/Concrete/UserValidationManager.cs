using _31_GameProject.Abstract;
using _31_GameProject.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _31_GameProject.Concrete {
	public class UserValidationManager : IUserValidationService {
		public bool IsRealPerson(User user) {
			if ((user.UserFirstName == "İsmail") && (user.UserLastName == "Artun") && (user.UserTcNo == "1234567890") && (user.UserBirthYear == 1992)) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}
