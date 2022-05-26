package com.gredlturnquist.hackingspringboot.reactive;

import java.util.Objects;

import org.springframework.data.annotation.Id;

/**
 * Created by ShinD on 2022/05/26.
 */
public class Item {
	@Id
	private String id;

	private String name;
	private double price;

	public Item() {}

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}




	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Item item = (Item)o;
		return Double.compare(item.price, price) == 0 && Objects.equals(id, item.id)
			&& Objects.equals(name, item.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}
}
