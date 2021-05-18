package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String Message) {
		jLoggerManager manager =new jLoggerManager();
		manager.log(Message);
		
	}

}
