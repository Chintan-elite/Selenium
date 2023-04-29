package com;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyTest {
	
	private static final Logger log = LogManager.getLogger(MyTest.class);
	public static void main(String[] args) {
		
		
		log.debug("This is debug message");
		log.info("This is info message");
		log.error("This is error message");
		
		
		
	}
}
