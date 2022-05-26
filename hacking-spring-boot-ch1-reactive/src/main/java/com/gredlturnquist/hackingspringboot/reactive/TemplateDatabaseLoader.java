package com.gredlturnquist.hackingspringboot.reactive;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

/**
 * Created by ShinD on 2022/05/26.
 */
@Component
public class TemplateDatabaseLoader {

	@Bean
	CommandLineRunner initializer(MongoOperations mongo) {
		return args -> {
			mongo.save(new Item("Alf alarm clock", 19.99));
			mongo.save(new Item("xxxx table", 20.99));
		};
	}
}
