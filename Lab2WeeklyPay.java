import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Initialize Variables
        double wage;
        double hoursWorked;
        double overTimeHours = 0;
        double grossPay;
        double taxes;
        double netPay;
        double overTimeWage = 0;

        //Open scanner
        Scanner scanner = new Scanner(System.in);

        // User inputs hourly wage
        System.out.print("Enter how much you make an hour: ");
        wage = scanner.nextFloat();

        //User inputs hours worked this week
        System.out.print("Enter how many hours you've worked this week: ");
        hoursWorked = scanner.nextFloat();

        //Check to see if any invalid (negative) numbers
        if (hoursWorked < 0 || wage < 0 ){
            System.out.println("The hours worked or wage cannot be negative please rerun the program.");
            System.exit(0);
        }

        // If they worked overtime calculate over time wage and hours
        if (hoursWorked > 40){
            overTimeHours = hoursWorked - 40;
            hoursWorked = 40;
            overTimeWage = wage * 1.5;
        }

        // Calculate the gross pay, taxes, and net pay
        grossPay = (hoursWorked * wage) + (overTimeWage * overTimeHours);
        taxes = grossPay * 0.1;
        netPay = grossPay - taxes;

        // Display total values
        System.out.println("Your gross pay is: " + grossPay);
        System.out.println("Your total taxes are: " + taxes);
        System.out.println("Your net pay is: " + netPay);


        scanner.close();
    }
}