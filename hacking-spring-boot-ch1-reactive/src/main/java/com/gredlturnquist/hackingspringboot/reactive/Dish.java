package com.gredlturnquist.hackingspringboot.reactive;

/**
 * Created by ShinD on 2022/05/26.
 */
public class Dish {
	private String description;
	private boolean delivered = false;



	public static Dish deliver(Dish dish) {
		Dish deliveredDish = new Dish(dish.description);
		deliveredDish.delivered = true;
		System.out.println("[%s] 배달 중 (Dish.deliver)".formatted(dish));
		return deliveredDish;
	}

	public Dish(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Dish{" +
			"description='" + description + '\'' +
			", delivered=" + delivered +
			'}';
	}
}
