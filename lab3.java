import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] choices = { "Rock", "Paper", "Scissors", "Lizard", "Spock" };
        boolean playAgain = true;

        while (playAgain) {
            int playerChoice = getPlayerChoice(scanner, choices);
            int computerChoice = (int) (Math.random() * 5);

            System.out.println("Player chose: " + choices[playerChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            int result = (5 + playerChoice - computerChoice) % 5;
            if (result == 0) {
                System.out.println("It's a draw!");
            } else if (result % 2 == 1) {
                System.out.println("Player wins!");
            } else {
                System.out.println("Computer wins!");
            }

            System.out.print("Play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }

    public static int getPlayerChoice(Scanner scanner, String[] choices) {
        int playerChoice = -1;

        while (playerChoice < 0 || playerChoice >= choices.length) {
            System.out.println(
                    "Enter your choice (0 for Rock, 1 for Paper, 2 for Scissors, 3 for Lizard, 4 for Spock): ");
            if (scanner.hasNextInt()) {
                playerChoice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        return playerChoice;
    }
}
