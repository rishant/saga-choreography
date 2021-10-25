package com.vinsguru.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ProductPriceConfig {

    // product price map
	@Bean
	public Map<Integer, Integer> productPrice() {
		Map<Integer, Integer> productPrices = new HashMap<>();
		productPrices.put(1, 100);
		productPrices.put(2, 200);
		productPrices.put(3, 300);
		return productPrices;
	}

}
