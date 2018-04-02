package com.test.demo.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * java类获取spring容器测试类
 * @version v1.0
 * @author Administrator
 * @date 2018年1月1日
 */
public class SpringTest {
	private final static Logger logger = LoggerFactory.getLogger(SpringTest.class);
	private final static Log log = LogFactory.getLog(SpringTest.class);
	public static void main(String[] args) {
		getApplicationContext();
	}
	
	/**
	 * java类获取spring容器的bean
	 * @author Administrator  
	 * @date 2018年1月1日
	 */
	public static ApplicationContext getApplicationContext(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring-base.xml");
		log.info(">>>>>>>>>>成功获取spring容器： " + applicationContext);
		return applicationContext;
	}

}




















