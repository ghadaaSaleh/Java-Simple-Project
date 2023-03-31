import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CoinToss coinToss = new CoinToss();
        Scanner scanner = new Scanner(System.in);
        var guess = "";
        System.out.println("Enter First Player Name");
        Player player1 = new Player(scanner.next());
        System.out.println("Enter Second Player Name");
        scanner = new Scanner(System.in);
        Player player2 = new Player(scanner.next());
        do
        {
            System.out.println("Player1 ,Please guess head or tail");
            guess = scanner.next();
        }
        while (!coinToss.IsValidGuess(guess));

        player1.guess = guess;
        String winnerName = coinToss.ChooseWinner(player1, player2);
        System.out.println(winnerName + " is the winner");
    }
}