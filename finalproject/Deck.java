import java.util.ArrayList;
import java.util.List;


public class Deck {
    private int deck_size = 60;
    private List<Card> deck = new ArrayList<>();

    public Deck(CardPool card_pool){
        for (int i = 0; i < deck_size; i++ ){
            Card card = card_pool.getCard(i%card_pool.getCardPoolSize());
            this.deck.add(card);
        }
        // System.out.println(deck.size());
    }

    public void setDeck(List<Card> deck){
        this.deck = deck;
    }

    public void addToDeck(Card card){ // adds to the end of the deck
        this.deck.add(card);
    }

    public void addTopCard(Card card){
        this.deck.add(0, card);
    }

    public void removeTopCard(){
        this.deck.remove(0);
    }

    public void removeCard(Card card){
        this.deck.remove(card);
    }

    public Deck getDeck(){
        return this;
    }

    public List<Card> getCards(){
        return this.deck;
    }

    public Card getTopCard(){
        return deck.get(0);
    }

    // public String toString () {
    //     return 
    // }

}
