public class SelectCardCommand implements CommandInterface {

    private Player player;

    public SelectCardCommand(Player player) {
        this.player = player;
    }

    public void doCommand() {

        this.player.selectCard();

    }

    public void undoCommand() {
        this.player.deselectCard();
    }

}
