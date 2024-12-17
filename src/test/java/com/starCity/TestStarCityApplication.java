package com.starCity;

import org.springframework.boot.SpringApplication;

public class TestStarCityApplication {

	public static void main(String[] args) {
		SpringApplication.from(StarCityApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
