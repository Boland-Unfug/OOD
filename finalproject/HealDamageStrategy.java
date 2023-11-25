public class HealDamageStrategy implements CardStrategy {
    private int heal_amount;
    private int damage_amount;

    public HealDamageStrategy(int heal, int damage) {
        this.heal_amount = heal;
        this.damage_amount = damage;
    }

    public String toString() {
        return "Heal " + this.heal_amount + " health, deal damage: " + this.damage_amount + "\n";
    }

    @Override
    public void doStrategy(Player player, Player target) {
        HealCardCommand healDamage = new HealCardCommand(player, this.heal_amount);
        DamageCardCommand damage = new DamageCardCommand(target, this.damage_amount);
        healDamage.doCommand();
        damage.doCommand();
    }
}
