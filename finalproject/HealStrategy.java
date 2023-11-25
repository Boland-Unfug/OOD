public class HealStrategy implements CardStrategy {

    private int amount;

    public HealStrategy(int amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Heal " + this.amount + " health. \n";
    }

    @Override
    public void doStrategy(Player player, Player target) {
        HealCardCommand heal = new HealCardCommand(target, this.amount);
        heal.doCommand();
    }
}