/**
 * 
 */
package ca.sheridancollege.project;

/**
 * @Omar Jawed
 *@991593731
 */
public class Hand extends CardPrint<NumberCards> {
	
	public Hand(){
		super();
	}

	@Override
	public boolean addCard(NumberCards card){
		return this.cardList.add(card);
	}
	public NumberCards getCard(int index){
		try{
			return this.cardList.remove(index);
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
	public String showCard(int index){
		try{
			return this.cardList.get(index).toString();
		} catch(IndexOutOfBoundsException e){
			return null;
		}
	}
}