package com.planet.shop.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.planet.shop.mbg.mapper")
public class ShopApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShopApiApplication.class, args);
	}
}
