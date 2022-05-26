package com.gredlturnquist.hackingspringboot.reactive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

/**
 * Created by ShinD on 2022/05/26.
 */
public class Cart {
	@Id private String id;
	private List<CartItem> cartItems;

	public Cart() {
	}

	public Cart(String id) {
		this(id, new ArrayList<>());
	}

	public Cart(String id, List<CartItem> cartItems) {
		this.id = id;
		this.cartItems = cartItems;
	}

	public String getId() {
		return id;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
}
