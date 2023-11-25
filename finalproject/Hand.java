import java.util.List;
import java.util.ArrayList;

public class Hand {
    private int max_hand_size = 7;
    List<Card> hand = new ArrayList<>();

    public Hand(){
        // this.hand = new ArrayList<Card>();
    }

    public void addToHand(Card card){
        hand.add(card);
    }

    public void removeFromHand(Card card){
        hand.remove(card);
    }

    public int getHandSize(){
        return hand.size();
    }

    public void printHand(){
        for (int i = 0; i < hand.size(); i++){
            System.out.println(hand.get(i));
        }
    }
    public Hand getHand(){
        return this;
    }

    public List<Card> getCards(){
        return this.hand;
    }

    public Card getCard(String cardname){
        for (int i = 0; i < this.hand.size(); i++){
            Card card = this.hand.get(i);
            // System.out.println(card.getName() + " =? " + cardname);
            if (card.getName().compareTo(cardname) == 0){
                // System.out.println("Found card");
                return card;
            }
        }
        return null; // this will probably make me hate myself later
    }
}