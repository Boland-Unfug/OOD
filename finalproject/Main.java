import java.util.Scanner;

public class Main {
    // Test

    public static void main(String[] args) {


        Game game = new Game(2);
        Player player1 = game.getPlayers().get(0);
        Player player2 = game.getPlayers().get(1);
        

        Scanner scan = new Scanner(System.in);
        String input = "";
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { // p1 turn
                System.out.println("Player 1's turn");
                game.turn(player1, player2, scan);
            }

            else {
                System.out.println("Player 2's turn");
                game.turn(player2, player1, scan);
            }
        }
    }
}
