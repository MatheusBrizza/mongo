package com.fundatec.tabd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ExercicioMongoDbApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ExercicioMongoDbApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		;
	}

}
