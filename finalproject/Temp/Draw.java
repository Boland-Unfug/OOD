import Deck;
import Hand;

public class Draw implements Play {
    private Deck deck;
    private Hand hand;
    private Effect effect;
    private int numCards;

    public Draw(Effect effect, Deck deck, Hand hand, int numCards) {
        this.deck = deck;
        this.hand = hand;
        this.effect = effect;
        this.numCards = numCards;
    }

    public void play() {
        effect.draw(this.deck, this.hand, this.numCards);
    }
}
