package com.coderscampus.lesson5;

public enum Card {
	ACE(14, 1),
	Two(2, 2),
	THREE(3, 3),
	FOUR(4, 4),
	FIVE(5, 5),
	SIX(6, 6),
	SEVE(7, 7),
	EIGHT(8, 8),
	NINE(9, 9),
	TEN(10, 10),
	JACK(11, 10),
	QUEEN(12, 10),
	KING(13, 10);
	
	private Integer cardValue;
	private Integer CardSecondaryValue;
	
	private Card (Integer cardValue, Integer cardSecondaryValue) {
		this.cardValue = cardValue;
		this.CardSecondaryValue = cardSecondaryValue;
		
	}

	public Integer getCardValue() {
		return cardValue;
	}

	public void setCardValue(Integer cardValue) {
		this.cardValue = cardValue;
	}

	public Integer getCardSecondaryValue() {
		return CardSecondaryValue;
	}

	public void setCardSecondaryValue(Integer cardSecondaryValue) {
		CardSecondaryValue = cardSecondaryValue;
	}
}
