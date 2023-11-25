
public class DiscardCommand implements CommandInterface{

    private Player player;
    private Card card;

    public DiscardCommand(Player player, Card card) {
        this.player = player;
        this.card = card;
    }

    public void doCommand() {
        this.player.discard(this.card);
    }

    public void undoCommand() {
        this.player.getHand().addToHand(this.card);
    }
}