package Temp;
import CommandInterface;
import Player;

public class DiscardCommand implements CommandInterface{

    private Player player;
    private int amount;

    public DiscardCommand(Player player, int amount) {
        this.player = player;
        this.amount = amount;
    }

    public void doCommand() {
        this.player.discard(this.amount);
    }
}