public class SelectTargetCommand implements CommandInterface {
    
    private Game game;
    
    public SelectTargetCommand(Game game) {
        this.game = game;
    }
    
    public void doCommand() {
        this.game.selectPlayer();
    }

    public void undoCommand() {
        this.game.selectPlayer();
    }
}
