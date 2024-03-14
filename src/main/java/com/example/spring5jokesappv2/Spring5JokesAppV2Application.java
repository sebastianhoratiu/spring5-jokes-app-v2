package com.example.spring5jokesappv2;

import com.example.spring5jokesappv2.controller.JokesController;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {

		SpringApplication.run(Spring5JokesAppV2Application.class, args);

	}

	@Bean
	public ChuckNorrisQuotes getChuckNorrisBean() {
		return new ChuckNorrisQuotes();
	}
}
