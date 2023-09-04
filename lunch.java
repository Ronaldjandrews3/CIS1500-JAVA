import java.util.Scanner;

public class lunch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your average lunch expense: ");

        double lunchExpense = scanner.nextDouble();

        scanner.close();

        double monthlyExpense = lunchExpense * 30;

        System.out.println("Your monthly lunch expense is: $" + monthlyExpense);
    }
}