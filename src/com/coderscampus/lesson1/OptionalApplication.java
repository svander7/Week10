package com.coderscampus.lesson1;

import java.math.BigDecimal;
import java.util.Optional;

public class OptionalApplication {

	public static void main(String[] args) {
		
		// Lesson 1
		Optional<String> fullName = Optional.of("Trevor Page");
		
		System.out.println(fullName);

		String trevor = fullName.get();
		
		System.out.println(trevor);
		
		// Lesson 2
		Recipe cookies = new Recipe();
		cookies.setName("ChocolateChipCookies");
		cookies.setInstructions("\n1. Pre-heat oven\n2. Put dough on baking sheet\n3. Cook for 15 minutes\n4. ");
		cookies.setPriceOpt(new BigDecimal (9.99));
		
		System.out.println(cookies);
		
		// Good way to get the wrapped data in Optional
		BigDecimal price = cookies.getPriceOpt()
								  .map(p -> p)
								  .orElse(new BigDecimal(0));
		
		// "Bad" way to get the wrapped data in Optional
//		if (cookies.getPriceOpt().isPresent()) {
//			BigDecimal price = cookies.getPriceOpt().get();
//			System.out.println(price);
//		}
		
		// Lesson 4
		cookies.getPriceOpt()
			   .ifPresent(RecipeService::billClient);
	}

}
