/**
 * 
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * @Omar Jawed
 *@991593731
 */
public class allPayers {
	private String playerID; 
	private ArrayList<Card> hand;
	private ArrayList<Player> players;
	private boolean canAdd;
	private int currElem;
	private int nextElem;
	private boolean toRight;
	
	
	private allPayers() {
		this.players = new ArrayList<Player>();
		this.canAdd = true;
		this.currElem = 0;
		this.nextElem = 0;
		this.toRight = true;
	}

	public boolean addPlayer(Player player) {
		if (this.canAdd) {
			this.players.add(player);

			if (this.players.size() == 2)
				this.nextElem = 1;
		}

		return this.canAdd;
	}

	public String getPlayersStatus() {
		String pStatus = "";
		Player player;
		for (int i = 0; i < this.players.size(); i++) {
			player = this.players.get(i);
			pStatus += "[" + player.getName() + ": ";
			pStatus += Integer.toString(player.numCards()) + "] ";
		}

		return pStatus;
	}
	public String getPlayerID() {
		return playerID;
	}
	public void setPlayerID(String givenID) {
		playerID = givenID;
	}
}
