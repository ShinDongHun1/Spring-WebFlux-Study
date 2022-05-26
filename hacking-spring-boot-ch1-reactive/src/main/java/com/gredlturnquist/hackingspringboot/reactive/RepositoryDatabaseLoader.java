/**
package com.gredlturnquist.hackingspringboot.reactive;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class RepositoryDatabaseLoader {
	@Bean
	CommandLineRunner initialize(BlockingItemRepository repository) {
		return args -> {
			repository.save(new Item("Alf alarm clock", 19.99));
			repository.save(new Item("smurf TV tray", 24.99));
		};
	}
}
*/
