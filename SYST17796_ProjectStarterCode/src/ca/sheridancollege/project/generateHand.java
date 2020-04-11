/**
 * 
 */
package ca.sheridancollege.project;

/**
 * @Omar Jawed
 *@991593731
 */
public class generateHand {
	private int numberCards = 60;
	cardGameExample[] deck = new cardGameExample[numberCards];
	public void generate() {
		int count = 0;
		for (cardGameExample.SUIT s:cardGameExample.SUIT.values()) { // read enum SUIT
			for(cardGameExample.VALUE v:cardGameExample.VALUE.values()) {
				deck[count] = new cardGameExample(s, v);
				count++;
			}
		}
		
	}
}
