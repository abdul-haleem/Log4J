package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingObject {

	private static Logger logger = LoggerFactory.getLogger(LoggingObject.class);
	
	public void logSomething()
	{
		logger.debug("Let's celcebrate !");
	}
}
