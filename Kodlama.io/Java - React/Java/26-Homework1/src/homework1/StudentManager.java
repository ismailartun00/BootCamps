package homework1;

public class StudentManager extends UserManager{

	public void add(User user) {
		System.out.println (user.getId() +" "+ user.getName() +" "+ user.getLastName() + " �grenci olarak kaydedildi.");
	}
}