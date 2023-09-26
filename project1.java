import java.util.Random;
import java.util.Scanner;

public class project11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            int distanceToSurface = 10;
            int xTilt = random.nextInt(21) - 10;
            int yTilt = random.nextInt(21) - 10;
            boolean selfDestructActivated = false;

            System.out.println("Welcome to Lunar Lander Simulator!");
            System.out.println("Initial distance from surface: " + distanceToSurface);

            while (distanceToSurface > 0) {
                System.out.println("Available commands:");
                System.out.println("1. Adjust X-axis tilt (+ or -)");
                System.out.println("2. Adjust Y-axis tilt (+ or -)");
                System.out.println("3. Thruster (increase distance from surface by 2)");
                System.out.println("4. Do nothing");
                System.out.println("5. Activate self destruct sequence");
                System.out.print("Enter a command (1-5): ");

                int command = scanner.nextInt();

                if (selfDestructActivated) {
                    System.out.print("Enter cancellation code: ");
                    int cancelCode = scanner.nextInt();

                    if (cancelCode == 12345) {
                        selfDestructActivated = false;
                    } else {
                        System.out.println("Invalid cancellation code. Self-destruct remains activated.");
                    }
                } else {
                    switch (command) {
                        case 1:
                            System.out.print("Enter X-axis tilt direction (+ or -): ");
                            char xDirection = scanner.next().charAt(0);
                            if (xDirection == '+') {
                                xTilt++;
                            } else if (xDirection == '-') {
                                xTilt--;
                            } else {
                                System.out.println("Invalid tilt direction.");
                            }
                            break;
                        case 2:
                            System.out.print("Enter Y-axis tilt direction (+ or -): ");
                            char yDirection = scanner.next().charAt(0);
                            if (yDirection == '+') {
                                yTilt++;
                            } else if (yDirection == '-') {
                                yTilt--;
                            } else {
                                System.out.println("Invalid tilt direction.");
                            }
                            break;
                        case 3:
                            distanceToSurface -= 2;
                            break;
                        case 4:
                            break;
                        case 5:
                            System.out.println("Self destruct sequence activated!");
                            selfDestructActivated = true;
                            break;
                        default:
                            System.out.println("Invalid command. Please choose a valid command (1-5).");
                            break;
                    }

                    if (selfDestructActivated) {
                        System.out.println(
                                "Self-destruct sequence is active. Enter the cancellation code to deactivate.");
                    } else {
                        distanceToSurface--;
                    }
                }
            }

            if (xTilt != 0 || yTilt != 0) {
                System.out.println("Lander crashed! Game over.");
            } else {
                System.out.println("Congratulations! You successfully landed the lunar lander!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }

        System.out.println("Thank you for playing Lunar Lander Simulator!");
        scanner.close();
    }
}
