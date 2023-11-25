import Player;

public class Damage implements Play {
    private Player player;
    private Effect effect;
    private int damage;

    public Damage(Effect effect, Player player, int damage) {
        this.player = player;
        this.effect = effect;
        this.damage = damage;
    }

    public void play() {
        effect.damage(this.player, this.damage);
    }
}
