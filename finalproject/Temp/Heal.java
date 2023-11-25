import Player;

public class Heal implements Play {
    private Effect effect;
    private Player player;
    private int heal;

    public Heal(Effect effect, Player player, int heal) {
        this.effect = effect;
        this.player = player;
        this.heal = heal;
    }

    public void play() {
        effect.heal(this.player, this.heal);
    }
}