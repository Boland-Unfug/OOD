import java.util.ArrayList;
public class CardPool {
    private ArrayList<Card> card_pool;

    CardPool(){
        card_pool = new ArrayList<Card>();
        Card shock = new Card("Shock", 1, new DamageStrategy(3));
        this.addCard(shock);

        Card heal = new Card("Heal", 1, new HealStrategy(3));
        this.addCard(heal);

        Card healDamage = new Card("Lightning Helix", 3, new HealDamageStrategy(3, 3));
        this.addCard(healDamage);

        Card opt = new Card("Opt", 0, new DrawStrategy(2));
        this.addCard(opt);

        Card bolt = new Card("Bolt", 2, new DamageStrategy(5));
        this.addCard(bolt);

        Card nuke = new Card("Nuke", 6, new DamageStrategy(10));

    }

    public int getCardPoolSize() {
        return card_pool.size();
    }

    public void addCard(Card card) {
        card_pool.add(card);
    }

    public void removeCard(Card card) {
        card_pool.remove(card);
    }

    public Card getCard(int index) {
        return card_pool.get(index);
    }
}