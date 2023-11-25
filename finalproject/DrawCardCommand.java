
public class DrawCardCommand implements CommandInterface {
    private Player player;
    private int amount;

    public DrawCardCommand(Player player, int amount) {
        this.player = player;
        this.amount = amount;
    }

    public void doCommand() {
        this.player.draw(this.amount);
    }

    public void undoCommand() {
        this.player.discard(this.amount);
    }
}