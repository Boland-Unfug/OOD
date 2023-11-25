// public class PlayCard {
//     private Card card;
//     private Effect effect;
//     private Player player;
//     private Player opponent;
//     private Stack stack;

//     // Constructor
//     public PlayCard(Card card, Player player, Player opponent) {
//         this.card = card;
//         this.player = player;
//         this.opponent = opponent;
//         this.effect = new Effect();
//         this.stack = new Stack();

//         initializePlays();
//     }

//     private void initializePlays() {
//         // Create the plays
//         Damage damage = new Damage(effect, opponent, card.getDamage());
//         Heal heal = new Heal(effect, player, card.getHeal());
//         Draw draw = new Draw(effect, player.getDeck(), player.getHand(), card.getDraw());
//         UseEnergy cost_move = new UseEnergy(effect, player, card.getCost());

//         // Add the plays to the stack
//         stack.addPlay(damage);
//         stack.addPlay(heal);
//         stack.addPlay(draw);
//         stack.addPlay(cost_move);
//     }
// }
