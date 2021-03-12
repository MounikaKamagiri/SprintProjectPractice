package com.cg.apps.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.cg.apps.springdatajpa.customerms.ui.CustomerMain;

@SpringBootApplication
public class SpringDataJpaApplication {	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);
		CustomerMain customerMain=context.getBean(CustomerMain.class);
		customerMain.start();
	}

}
