package interfaces;

public class CustomerManager {
	private Logger[] loggers;
	
	public CustomerManager() {
		
	}
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	// loosly - tightl coupled
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri Silindi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void update(Customer customer) {
		System.out.println("Müþteri Güncellendi : " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}
