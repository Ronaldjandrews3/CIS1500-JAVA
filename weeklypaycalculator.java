import java.util.Scanner;

public class weeklypaycalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your hourly wage: ");
        double hourlyWage = scanner.nextDouble();
        System.out.print("Enter hours worked this week: ");
        double hoursWorked = scanner.nextDouble();

        double grossPay;
        if (hoursWorked <= 40) {
            grossPay = hourlyWage * hoursWorked;
        } else {
            double regularPay = hourlyWage * 40;
            double overtimePay = (hoursWorked - 40) * (hourlyWage * 1.5);
            grossPay = regularPay + overtimePay;
        }

        double taxesOwed = 0.10 * grossPay;
        double netPay = grossPay - taxesOwed;

        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Taxes Owed: $" + taxesOwed);
        System.out.println("Net Pay: $" + netPay);

        scanner.close();
    }
}
