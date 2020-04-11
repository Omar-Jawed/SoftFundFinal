package ca.sheridancollege.project;

public class printCards {

	public static void main(String[] args) {
		generateHand ch = new generateHand();
		ch.generate();// delegation
		for (cardGameExample c : ch.deck) {
			System.out.println(c.getValue() + " of " + c.getSuit());
		}
	}
}
