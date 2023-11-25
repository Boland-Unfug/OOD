import Card;
import CardStrategy;
import Player;

package Temp;
public class DiscardStrategy implements CardStrategy {
    
        private int amount;
        private Card card;
    
        public DiscardStrategy(int amount) {
            this.card = card;
        }

        public String toString() {
            return "Discard Strategy : " + this.amount + "\n";
        }
        
        @Override
        public void doStrategy(Player player, Player target) {
            RemoveCardCommand discard = new RemoveCardCommand(target, card);
        }
}
