package com.ezrealyi.test;

import com.ezrealyi.app.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Appconfig.class);
		System.out.println(app.getBean("user"));
	}
}
