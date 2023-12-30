import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// Request Class

public class Game {
    private List<Player> players;
    private Player player;

    public Game(int players) {

        this.players = new ArrayList<Player>();

        CardPool cardPool = new CardPool();

        for (int i = 0; i < players; i++) {
            Player player = new Player("Player " + i, cardPool);
            this.players.add(player);
        }
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void selectPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which player do you want to target? 0 is you, n is n opponent");
        int target_player = scan.nextInt();
        if (target_player >= players.size()) {
            System.out.println("Invalid player");
            selectPlayer();
        }
        player = players.get(target_player);
    }

    public void deselectPlayer() {
        player = null;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void turn(Player player, Player opponent, Scanner scan) {
        Stack stack = new Stack();
        boolean ended = false;
        player.setEnergy(player.getEnergy() + 3);
        DrawCardCommand draw = new DrawCardCommand(player, 1);
        draw.doCommand();
        
        while (player.getEnergy() > 0 && opponent.isDead() == false && opponent.isDead() == false) {
            play(player, opponent, scan, stack);
            System.out.println("Do you want to end your turn? (Y/N)");
            String input = scan.nextLine();
            if (input.equals("Y") == true) {
                ended = true;
                break;
            }
        }
    }

    public void play(Player player, Player opponent, Scanner scan, Stack stack) {
        System.out.println("Player Health:" + player.getHealth() + " Energy:" + player.getEnergy());
        System.out.println("Opponent Health:" + opponent.getHealth() + " Energy:" + opponent.getEnergy());

        // Select a card to play
        SelectCardCommand select = new SelectCardCommand(player);
        select.doCommand();
        if (player.getSelectedCard() != null) {
            System.out.println("Player " + player + " played " + player.getSelectedCard().getName());

            // Add card to the stack
            stack.addCard(player.getSelectedCard());

            // Ask opponent if they want to play a card (instant speed)
            System.out.println("Opponent, do you want to play a card? (Y/N)");
            String input = scan.nextLine();
            if (input.equals("Y") == true) { // For now I can be lazy and say all cards are instant, so I can just call
                                             // play again
                play(opponent, player, scan, stack);
            }

            SelectTargetCommand select_target = new SelectTargetCommand(this);
            select_target.doCommand();

            // Play the stack
            System.out.println("Playing the stack");
            stack.play(player, opponent);
        }

        System.out.println("Interactions done.");
        select.undoCommand();
    }
}