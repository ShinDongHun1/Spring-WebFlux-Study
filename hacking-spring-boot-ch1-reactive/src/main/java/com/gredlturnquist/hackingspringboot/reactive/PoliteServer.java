package com.gredlturnquist.hackingspringboot.reactive;

import reactor.core.publisher.Flux;

/**
 * Created by ShinD on 2022/05/26.
 */
public class PoliteServer {
	private final KitchenService kitchenService;

	public PoliteServer(KitchenService kitchenService) {
		this.kitchenService = kitchenService;
	}

	Flux<Dish> doingMyJob(){
		return this.kitchenService.getDishes()
			.doOnNext(dish -> System.out.println("메뉴[%s] 나왔어  ".formatted(dish)))
			.doOnError(error -> System.out.println(" 에러났어 미안 ㅜㅜ  [%s] ".formatted(error.getMessage())))
			.doOnComplete(() -> System.out.println("열시미 일해줘서 고마웡 ><"))
			.map(Dish::deliver);
	}
}
