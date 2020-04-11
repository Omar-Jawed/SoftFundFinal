package ca.sheridancollege.project;

public class cardGameExample {

	public enum SUIT {
		RED, YELLOW, GREEN, BLUE
	};

	public enum VALUE {
		ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, REVERSE, PLUS_TWO, PLUS_FOUR, WILD_CARD, BLOCK
	};

	private SUIT suit;
	private VALUE value;

	/**
	 * @param s
	 * @param v
	 */
	public cardGameExample(SUIT s, VALUE v) {
		// TODO Auto-generated constructor stub
		this.suit = s;
		this.value = v;
	}

	public SUIT getSuit() {
		return suit;
	}

	public VALUE getValue() {
		return value;
	}
}
