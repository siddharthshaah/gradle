package com.gradledepmgmt.test;

import com.gradledepmgmt.config.JavaConfig;
import com.gradledepmgmt.dao.PassengerDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GradleDepTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		PassengerDao dao = context.getBean(PassengerDao.class);
		dao.getPassengers().forEach(System.out::println);
	}
}
