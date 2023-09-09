import java.util.Scanner;

public class inchestoyards {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of inches
        System.out.print("Enter the number of inches: ");
        double inches = scanner.nextDouble();

        // Convert inches to yards (1 yard = 36 inches)
        double yards = inches / 36.0;

        // Print the result
        System.out.println("The total number of yards is " + yards);

        // Close the scanner
        scanner.close();
    }
}
