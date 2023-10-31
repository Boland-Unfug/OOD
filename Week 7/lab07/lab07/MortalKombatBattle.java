package lab07;


/*
 * 10 points] Mortal Combat: 
 
o Each Character (like Sub-Zero, Mileena, etc.) is a Player. Two characters take part in every 
battle. 
o Hit policies: during every hit, the attacker hits the opponent with all of their attack points. 
From every hit of the opponent, the defender loses their health by the following rule:  
 
𝑑𝑒𝑓𝑒𝑛𝑑𝑒𝑟!𝑠 𝑟𝑒𝑚𝑎𝑖𝑛𝑖𝑛𝑔 ℎ𝑒𝑎𝑙𝑡ℎ = 𝑐𝑢𝑟𝑟𝑒𝑛𝑡 ℎ𝑒𝑎𝑙𝑡ℎ 𝑝𝑜𝑖𝑛𝑡 −
 (𝑎𝑡𝑡𝑎𝑐𝑘 𝑝𝑜𝑖𝑛𝑡 𝑜𝑓 𝑡ℎ𝑒 𝑎𝑡𝑡𝑎𝑐𝑘𝑒𝑟 – 10% 𝑜𝑓 𝑑𝑒𝑓𝑒𝑛𝑑 𝑝𝑜𝑖𝑛𝑡𝑠 𝑜𝑓 𝑡ℎ𝑒 𝑑𝑒𝑓𝑒𝑛𝑑𝑒𝑟)  
 
To keep our game simple, we will stop here!!! 
  
• Implement the system for the client.  
[10 points each for the 2 classes and  
10 points for the superclass that defines the gaming algorithm] 
 
• Create a Demo class where you test at least one instance of each of the games (Mortal 
Combat and Pokemon).  [5 * 2 = 10 points] 
  
Submit all of your source code. Please - 
o Write each class in a separate file. 
o The Player class has Javadoc comments included in it.  
o Use a similar strategy to add JavaDoc comments for each of the classes.  
 */
public class MortalKombatBattle {
    public static void main(String[] args) {
        // create two players
        Player p1 = new Player(1, 150, 150, 150);
        Player p2 = new Player(2, 300, 100, 160);

        // create a combat object
        Combat combat = new CombatTemplate();

        // set the attack and defense modifiers
        combat.set_attack_modifier(1); //technically unnecessary, since default is 1
        combat.set_defense_modifier(0.1);

        // run the fight
        Player winner = combat.fight(p1, p2);

        // print the winner
        System.out.println("The winner is player " + winner.getId());
    }
}
