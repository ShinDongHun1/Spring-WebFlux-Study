package com.gredlturnquist.hackingspringboot.reactive;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import reactor.core.publisher.Mono;

/**
 * Created by ShinD on 2022/05/26.
 */
@Controller
public class HomeController {

	@GetMapping
	Mono<String> home() {
		return Mono.just("home");
	}
}
