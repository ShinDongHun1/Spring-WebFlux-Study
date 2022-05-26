package com.gredlturnquist.hackingspringboot.reactive;

/**
 * Created by ShinD on 2022/05/26.
 */
public class CartItem {
	private Item item;
	private int quantity;

	public CartItem() {
	}

	public CartItem(Item item) {
		this.item = item;
		this.quantity = 1;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void increment() {
		this.quantity ++;
	}
}
