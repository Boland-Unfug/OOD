
public class DamageStrategy implements CardStrategy {
    private int amount;

    public DamageStrategy(int amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Deal " + this.amount + " Damage. \n";
    }

    @Override
    public void doStrategy(Player player, Player target) {
        DamageCardCommand damage = new DamageCardCommand(target, this.amount);
        damage.doCommand();
    }
}