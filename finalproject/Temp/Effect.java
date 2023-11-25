import Deck;
import Hand;
import Player;

public class Effect {    
    public void damage(Player player, int damage){   
        System.out.println("Damaging " + player + " by " + damage);   
        player.setHealth(player.getHealth() - damage);
        System.out.println(player);
    }
     
    public void heal(Player player, int heal){    
        System.out.println("Healing " + player + " by " + heal);  
        player.setHealth(player.getHealth() + heal);
        System.out.println(player);
    }

    public void draw(Deck deck, Hand hand, int draw){
        System.out.println("Drawing " + draw + " cards");  
        // System.out.println(deck);
        for(int i = 0; i < draw; i++){
            hand.addToHand(deck.getTopCard());
            deck.removeTopCard();
        }
    }

    public void draw(Deck deck, Hand hand){
        System.out.println("Drawing 1 card");  
        // System.out.println(deck);
        hand.addToHand(deck.getTopCard());
        deck.removeTopCard();
    }

    public void useEnergy(Player player, int cost){
        System.out.println("Using " + cost + " of " + player + "'s energy.");
        player.setEnergy(player.getEnergy()- cost);
    }
}
