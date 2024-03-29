package com.ezrealyi.app;

import com.ezrealyi.annotation.EnableWork;
import com.ezrealyi.entity.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.ezrealyi")
@Configuration
@EnableWork
public class Appconfig {
	@Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	public SpringBean springBean() {
		return new SpringBean();
	}
}
