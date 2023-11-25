
// Concrete Command
public class DamageCardCommand implements CommandInterface {
    private Player target;
    private int amount;

    public DamageCardCommand(Player target, int amount) {
        this.target = target;
        this.amount = amount;
    }

    public void doCommand() {
        this.target.damage(amount);
    }

    public void undoCommand() {
        this.target.heal(amount);
    }
}