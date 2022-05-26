package com.gredlturnquist.hackingspringboot.reactive;

import reactor.core.publisher.Flux;

/**
 * Created by ShinD on 2022/05/26.
 */
public class SimpleServer {
	private final KitchenService kitchenService;

	public SimpleServer(KitchenService kitchenService) {
		this.kitchenService = kitchenService;
	}

	Flux<Dish> doingMyJob(){
		return this.kitchenService.getDishes()
			.map(Dish::deliver);
	}
}
