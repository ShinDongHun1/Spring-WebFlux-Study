package com.gredlturnquist.hackingspringboot.reactive;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;

/**
 * Created by ShinD on 2022/05/26.
 */
@Service
public class KitchenService {

	private List<Dish> menu = Arrays.asList(new Dish("치킨"), new Dish("피자"),new Dish("햄버거"), new Dish("스프"));
	private Random picker = new Random();


	Flux<Dish> getDishes(){
		return Flux.<Dish>generate(
			sink -> sink.next(randomDish())
		).delayElements(Duration.ofMillis(250));
	}

	private Dish randomDish() {
		return menu.get(picker.nextInt(menu.size()));
	}

}
