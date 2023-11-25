
// Concrete Command
public class HealCardCommand implements CommandInterface {
    private Player target;
    private int amount;

    public HealCardCommand(Player target, int amount) {
        this.target = target;
        this.amount = amount;
    }

    public String toString() {
        return "Heal " + this.target.getName() + " for " + this.amount + " health";
    }

    public void doCommand() {
        System.out.println(this.toString());
        this.target.heal(amount);
    }

    public void undoCommand() {
        this.target.damage(amount);
    }
}