package com.gredlturnquist.hackingspringboot.reactive;

/**
 * Created by ShinD on 2022/05/26.
 */
public class PoliteRestaurant {
	public static void main(String[] args) {
		PoliteServer server = new PoliteServer(new KitchenService());

		server.doingMyJob().subscribe(
			dish -> System.out.println("[%s] 먹는 중".formatted(dish)),
			throwable -> System.err.println(throwable)
		);
	}
}
