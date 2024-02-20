package com.coderscampus.lesson5;

public class EnumApplication {

	public static void main(String[] args) {
		
		User user = new User("Trevor", "asdfasdf");

		System.out.println(user);
		
		if ("A" .equals(user.getStatus().getValue())) {
			System.out.println("User is active.");
		}
		
		if ("ACTIVE".equals(user.getStatus().name())) {
			System.out.println("User is active.");
		}
		
		System.out.println("Ace primary Value: " + Card.ACE.getCardValue());
		System.out.println("Ace secondary Value: " + Card.ACE.getCardSecondaryValue());
	}

}
