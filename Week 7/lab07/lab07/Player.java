package lab07;
/**
 * 
 * @author fahmida hamid
 * @date Oct 15 2020
 * @version 1.1
 * 
 * The Player class is used to create a Player object with the following properties:
 *  id, health, attack
 *  
 *  The Player has four properties: id, health, defend, and attack. 
 * ‘id’ is used to identify each Player uniquely. 
 * ‘health’, ‘defend’, and ‘attack’ are positive integers. 
 * ‘attack <= health’, meaning for each Player, their attack points should not be more than their health points, 
 * ‘defend (<= 100)’ expresses what percent of the attack a player can defend.
 *  If the health point goes below or equal to 0, then a player is declared dead.
 */

public class Player{

	protected int attack;
	protected int health;
	protected int defend;
	protected int id;
	
	public Player(int id, int attack, int defend, int health)
	{
		this.id = id;
		this.attack = attack;
		this.defend = defend;
		this.health = health;

	}
	
	public void setHealth(int hp) {
		
		this.health = hp;
		
	}
	
	public int getHealth() {
		
		return this.health;
	}
	
	public int getId() {
		
		return this.id;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public int getAttack() {
		
		return this.attack;
	}

	public int getDefend() {
		
		return this.defend;
	}
	/**
	 * @return true or false depending on the health point
	 */
	public boolean isDead() {
		if(health > 0)
			return false;
		else
			return true;
	}
	
		
}
