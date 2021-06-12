package nLayeredDemo.core.concretes;

import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
	}

}
