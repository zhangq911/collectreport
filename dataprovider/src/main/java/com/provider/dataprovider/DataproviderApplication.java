package com.provider.dataprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-providers.xml"})
@MapperScan(value = "com.provider.dataprovider.dao")
public class DataproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataproviderApplication.class, args);
	}

}
