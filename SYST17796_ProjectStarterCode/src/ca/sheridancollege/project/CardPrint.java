/**
 * 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @Omar Jawed @991593731
 */
public abstract class CardPrint<NumberCards> {
	protected ArrayList<NumberCards> cardList;

	public CardPrint() {
		this.cardList = new ArrayList<NumberCards>();
	}

	public abstract boolean addCard(NumberCards card);

	public abstract NumberCards getCard(int index);

	public int getNumCards() {
		return this.cardList.size();
	}
	public boolean isEmpty() {
		if (0 == this.cardList.size())
			return true;
		else
			return false;
	}

	/**
	 * @param card
	 * @return
	 */
	public boolean addCard(ca.sheridancollege.project.NumberCards card) {
		// TODO Auto-generated method stub
		return false;
	}
}