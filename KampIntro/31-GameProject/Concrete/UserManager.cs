using _31_GameProject.Abstract;
using _31_GameProject.Entities;
using System;
using System.Collections.Generic;
using System.Text;

namespace _31_GameProject.Concrete {
	public class UserManager : IUserService {
		UserValidationManager _userValidationManager;

		public UserManager(UserValidationManager userValidationManager) {
			_userValidationManager = userValidationManager;
		}
		public void Add(User user) {
			if (_userValidationManager.IsRealPerson(user) == true) {
				Console.WriteLine("Kullanıcı Başarıyla Eklendi : " + user.UserFirstName + " " + user.UserLastName);
			}
			else {
				Console.WriteLine(user.UserFirstName + " " + user.UserLastName + " isimli kullanıcı gerçek kullanıcı olarak teyit edilemedi. Kayıt işlemi başarısız.");
			}
		}

		public void Delete(User user) {
			Console.WriteLine("Kullanıcı Silindi : " + user.UserFirstName + " " + user.UserLastName);
		}

		public void Update(User user) {
			Console.WriteLine("Kullanıcı Güncellendi : " + user.UserFirstName + " " + user.UserLastName);
		}
	}
}
