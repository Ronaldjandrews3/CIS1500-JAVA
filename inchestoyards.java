import java.util.Scanner;

public class inchestoyards {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of inches: ");
        double inches = scanner.nextDouble();

       
        double yards = inches / 36.0;

        
        System.out.println("The number of yards is " + yards);

        
        scanner.close();
    }
}
