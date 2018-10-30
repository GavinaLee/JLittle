package com.tongyidi.jlittle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 分布式日志存储系统Graylog，基于elk。比elk组合更易安装部署。
 */
public class GraylogTest {

	private final static Logger logger = LoggerFactory.getLogger(GraylogTest.class);

	public static void main(String[] args) {
		// 日志输出的优先级： debug < info < warn < error < fatal
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is error");
		
	}
}
