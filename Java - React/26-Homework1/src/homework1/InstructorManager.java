package homework1;

public class InstructorManager extends UserManager{
	
	public void add(User user) {
		System.out.println(user.getName()+" " + user.getLastName()+ " egitmen olarak eklendi.");
	}
	public void delete(User user) {
		System.out.println(user.getId() + " ID'li Ögrenci silindi.");
	}
	
	public void addCourse(Course course) {
		System.out.println(course.name +" "+ "Kursu Eklendi. Egitmen: " + course.instructor);
	}
}