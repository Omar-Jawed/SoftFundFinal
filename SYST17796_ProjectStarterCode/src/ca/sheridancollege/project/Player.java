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
	private playerNumber <Integer> playerNum;
	private Hand hand;
	private String name;
	
	public Player(playerNumber<Integer> playerNum){
		this("Player ", playerNum.getNum());
		this.name += this.playerNum.getNum();
	}
	
	public Player(String name, int playerNum) {
		this.playerNum   = new playerNumber<Integer>(playerNum);
		this.hand = new Hand();
		this.name = name;
	}
	
	public Player(String name, playerNumber<Integer> playerNum){
		this(name, playerNum.getNum());
	}
	
	public int getNum(){
		return this.playerNum.getNum();
	}
	
	public int numCards(){
		return hand.getNumCards();
	}
	
	public String getName(){
		return this.name;
	}
}
