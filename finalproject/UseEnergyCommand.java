public class UseEnergyCommand implements CommandInterface {
    
    private Player player;
    private int amount;
    
    public UseEnergyCommand(Player player, int amount) {
        this.player = player;
        this.amount = amount;
    }
    
    public void doCommand() {
        this.player.useEnergy(this.amount);
    }

    public void undoCommand() {
        this.player.addEnergy(this.amount);
    }
}
