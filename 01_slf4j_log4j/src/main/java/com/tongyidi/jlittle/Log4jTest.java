package com.tongyidi.jlittle;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jTest {
	private static final Logger logger = LogManager.getLogger(Log4jTest.class);

	public static void main(String[] args) {

		logger.info("this is log4j info");
		logger.error("this is log4j error");

	}
}
