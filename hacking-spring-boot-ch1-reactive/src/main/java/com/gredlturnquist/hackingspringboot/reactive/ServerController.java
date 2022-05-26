package com.gredlturnquist.hackingspringboot.reactive;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

/**
 * Created by ShinD on 2022/05/26.
 */

@RestController
public class ServerController {
	private final KitchenService kitchenService;

	public ServerController(KitchenService kitchenService) {
		this.kitchenService = kitchenService;
	}
	@GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	Flux<Dish> serveDishes() {
		return this.kitchenService.getDishes();
	}

	@GetMapping(value = "/server-dished", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	Flux<Dish> deliverDishes() {
		return this.kitchenService.getDishes()
			.map(Dish::deliver);
	}
}
