
public class DiscardStrategy implements CardStrategy {
    
        private Card card;
    
        public DiscardStrategy(Card card) {
            this.card = card;
        }

        public String toString() {
            return "Discard : " + this.card + " cards. \n";
        }
        
        @Override
        public void doStrategy(Player player, Player target) {
            DiscardCommand discard = new DiscardCommand(target, card);
            discard.doCommand();
        }

}
