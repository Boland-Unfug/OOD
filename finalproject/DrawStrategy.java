public class DrawStrategy implements CardStrategy {
    
        private int amount;
    
        public DrawStrategy(int amount) {
            this.amount = amount;
        }

        public String toString() {
            return "Draw " + this.amount + " cards. \n";
        }
        
        @Override
        public void doStrategy(Player player, Player target) {
            DrawCardCommand draw = new DrawCardCommand(target, this.amount);
            draw.doCommand();
        }
}
