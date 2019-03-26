package com.consumer.dataconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@ImportResource(value = {"classpath:dubbo-consumers.xml"})
@ComponentScan(basePackages = {"com.consumer.*"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableScheduling
public class DataconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataconsumerApplication.class, args);
	}

}
