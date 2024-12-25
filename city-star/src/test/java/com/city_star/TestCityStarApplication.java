package com.city_star;

import org.springframework.boot.SpringApplication;

public class TestCityStarApplication {

	public static void main(String[] args) {
		SpringApplication.from(CityStarApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
