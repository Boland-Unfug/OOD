/*
 * The stack is the invoker of the command pattern
 */

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Card> card_stack;

    Stack (){
        card_stack = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        card_stack.add(0, card);
        // System.out.println(plays.size());
    }

    public void removeCard(Card card) {
        card_stack.remove(0);
    }

    public void play(Player player, Player target) {
        Card card = card_stack.get(0);
        card.doEffect(player, target);
        card_stack.remove(0);
    }
    public void playAll(Player player, Player target) { // add instants, removal
        for (Card card : card_stack) {
            card.doEffect(player, target);
        }
        System.out.println("Stack cleared");
        card_stack.clear();
    }
}