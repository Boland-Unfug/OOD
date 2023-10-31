package lab07;


/*
 * Each Pokemon is a Player. Two Pokemons take part in every battle. 
o Pokemon in this version cannot use their defend points to reduce the impact of attacks. 
o Hit policies: during every hit, one Pokemon attacks the other with 50% of its attack point. In 
each iteration, a Player loses its health by the amount of the attacked point (50% of the 
attack point of the attacker).
 */
public class PokemonBattle {

    public static void main(String[] args) {
        // create two players
        Player p1 = new Player(1, 100, 100, 100);
        Player p2 = new Player(2, 300, 100, 160);

        // create a combat object
        Combat combat = new CombatTemplate();

        // set the attack and defense modifiers
        combat.set_attack_modifier(0.5);
        combat.set_defense_modifier(0);

        // run the fight
        Player winner = combat.fight(p1, p2);

        // print the winner
        System.out.println("The winner is player " + winner.getId());
    }
}
