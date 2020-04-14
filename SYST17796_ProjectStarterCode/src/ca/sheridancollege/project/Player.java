/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.*;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 * 
 * @author dancye, 2018
 */
public class Player {
	private playerNumber <Integer> p_id;
	private NumberCards p_hand;
	private String p_name;
	
	public Player(playerNumber<Integer> p_id){
		this("Player ", p_id.getID());
		this.p_name += this.p_id.getID();
	}
	
	public Player(String name, int p_id) {
		this.p_id   = new playerNumber<Integer>(p_id);
		this.p_hand = new NumberCards();
		this.p_name = name;
	}
	
	public Player(String name, playerNumber<Integer> p_id){
		this(name, p_id.getID());
	}
	
	/**
	 * Get the Identification (ID) of the player.
	 * @return the player's ID.
	 */
	public int getID(){
		return this.p_id.getID();
	}
	
	/**
	 * Get the name of the player.
	 * @return the player's name.
	 */
	public String getName(){
		return this.p_name;
	}
}
