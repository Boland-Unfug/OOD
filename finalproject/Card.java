/*
 * No longer the receiver of the command pattern
 */

import java.util.List;

public class Card{
    private CardStrategy effect;
    private String name;
    private int cost = 0; // default value
    private UseEnergyCommand useEnergy;
    private DiscardCommand discard;

    public Card(String name, int cost, CardStrategy effect) {
        this.name = name;
        this.cost = cost;
        this.effect = effect;
    }

    public void doEffect(Player player, Player target){
        useEnergy = new UseEnergyCommand(player, this.cost);
        useEnergy.doCommand();

        if (player.getEnergy() < 0) {
            System.out.println("Not enough energy to play this card.");
            useEnergy.undoCommand();
            return;
        }
        discard = new DiscardCommand(player, this);
        
        discard.doCommand();
        effect.doStrategy(player, target);
        
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return (this.name + ": " + this.cost + " " + this.effect);
    }
}