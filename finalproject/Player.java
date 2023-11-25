import java.util.Scanner;

public class Player {
    private int health = 10;
    private String name;
    private Deck deck;
    private Hand hand;
    private Card selectedcard;
    private int energy = 0;
    private boolean is_dead = false;


    public Player(String name, CardPool cardpool) {
        this.name = name;
        this.deck = new Deck(cardpool);
        this.hand = new Hand();
        this.setDeck(deck);
        this.setHand(hand);
        DrawCardCommand draw = new DrawCardCommand(this, 7);
        draw.doCommand();
    }

    public void setHealth(int health) {
        health = health;
    }

    public void heal(int heal) {
        health += heal;
    }

    public void damage(int damage) {
        health -= damage;
    }

    public void draw(int numCards) {
        System.out.println("Player " + this + " Drawing " + numCards + " cards.");
        for (int i = 0; i < numCards; i++) {
            this.hand.addToHand(deck.getTopCard());
            this.deck.removeTopCard();
        }
        // hand.printHand();
    }

    public void discard(Card card) {
        hand.removeFromHand(card);
    }

    public void discard(int amount){
        for (int i = 0; i < amount; i++){
            deck.addTopCard(hand.getCards().get(i));
            hand.removeFromHand(hand.getCards().get(i));
        }
    }

    public void selectCard(){
        System.out.println("Choose a card to play");
        hand.printHand();
        Scanner scan = new Scanner(System.in);
        String cardname = scan.nextLine();
        if (cardname.compareTo("Pass") == 0){
            return;
        }
        else
        if (hand.getCard(cardname) == null){
            System.out.println("Invalid card name");
            selectCard();
        }
        else
        {
            selectedcard = hand.getCard(cardname);
        }   
    }

    public void deselectCard(){
        selectedcard = null;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setEnergy(int energy){
        this.energy = energy;
    }

    public void addEnergy(int energy){
        this.energy += energy;
    }

    public void useEnergy(int energy){
        this.energy -= energy;
    }
        public int getHealth() {
        return health;
    }

    public String getName(){
        return name;
    }

    public Deck getDeck(){
        return deck;
    }

    public Hand getHand() {
        return hand;
    }

    public int getEnergy(){
        return this.energy;
    }

    public Card getSelectedCard(){
        return this.selectedcard;
    }

    public String toString(){
        return "Player [ Name: "+name+", Health: " + health +" ]";
    }

    public boolean isDead(){
        if (health <= 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}