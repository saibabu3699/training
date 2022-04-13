package com.test.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExample {

	/* Get actual class name to be printed on */
	private static Logger logger = LogManager.getLogger(LoggingExample.class);

	public static void main(String[] args) {
		
		//used for debugging
		logger.debug("Debug log message");
		
		//used for info messages
		logger.info("Info log message");
		
		//used for error conditions
		logger.error("Error log message");
	}

}
