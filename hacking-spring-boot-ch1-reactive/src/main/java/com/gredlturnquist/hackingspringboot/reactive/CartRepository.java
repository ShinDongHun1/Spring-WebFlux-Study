package com.gredlturnquist.hackingspringboot.reactive;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created by ShinD on 2022/05/26.
 */
public interface CartRepository extends ReactiveCrudRepository<Cart, String> {
}
