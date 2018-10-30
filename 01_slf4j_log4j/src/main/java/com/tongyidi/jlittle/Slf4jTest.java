package com.tongyidi.jlittle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

	private final static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
	
	public static void main(String[] args) {
		
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is error");
		//日志输出的优先级： debug < info < warn < error < fatal
		
	}	
	
}
