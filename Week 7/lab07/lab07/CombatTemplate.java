package lab07;

/*
 * Input: 2 players 
Output: winning Player 
 
 
Step: 
 
The first Player attacks the second Player (say, P attacks Q).  
After the hit, if the other Player is alive, they attack the first Player (Q attacks P). 
 
This process continues until one of them dies.

Can modify the attack and defense multiplier for each player.
 
Return the winner’s information.
 */
interface Combat {
    // each of these is needed in every combat system
    public Player fight(Player p1, Player p2);
    public int attack(Player p1, Player p2); // this just simplifies the code and makes it possible to use attack in other places
    public void set_defense_modifier(double defense_modifier);
    public void set_attack_modifier(double attack_modifier);
}

/*
 * I did an abstract interface with a concrete template class for the template method pattern.
 */
public class CombatTemplate implements Combat {
    private double defense_modifier = 1; // default values, in case the user doesn't set them
    private double attack_modifier = 1;

    public CombatTemplate() { // need an empty constructor for the template method pattern
    }

    // Allow the user to set the modifier, so that they can change the game rules and use this as a template
    public void set_defense_modifier(double defense_modifier) {
        this.defense_modifier = defense_modifier;
    }

    public void set_attack_modifier(double attack_modifier) {
        this.attack_modifier = attack_modifier;
    }

    // This attack just simplifies the fight function
    public int attack(Player p1, Player p2) {
        // System.out.println("dealing " + (int) ((p1.getAttack() * attack_modifier) - (p2.getDefend() * defense_modifier)) + " damage");
        return (int) ((p1.getAttack() * attack_modifier) - (p2.getDefend() * defense_modifier));
    }

    /**
     * This implements the combat cycle stated above
     * I used a turn cycle, so that the isDead() function checks as early as possible and both players dying won't happen
     */
    public Player fight(Player p1, Player p2) {
        int turn = 0;
        while (p1.isDead() == false && p2.isDead() == false) {
            if (turn % 2 == 0) {
                p2.setHealth(p2.getHealth() - attack(p1, p2));
            } else {
                p1.setHealth(p1.getHealth() - attack(p2, p1));
            }
            // System.out.println("Player 1: " + p1.getHealth() + " Player 2: " + p2.getHealth());
            turn++;
        }
        if (p1.isDead() == false) {
            return p1;
        } else {
            return p2;
        }
    }
}