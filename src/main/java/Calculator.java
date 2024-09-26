import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    static public void start() {
        CalculatorController controller = new CalculatorController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. " +
                    "Add\n2. " +
                    "Subtract\n3. " +
                    "Divide\n4. " +
                    "Modulus\n5. " +
                    "Get Percent\n6 " +
                    "Get Percentage of\n7 " +
                    "Multiply\n8 " +
                    "Exit");
            System.out.print("Enter choice (1-7): ");
            int choice = scanner.nextInt();

            if (choice == 8) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 1 || choice > 7) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter two numbers: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            ArrayList<Double> numbers = new ArrayList<>();
            numbers.add(a);
            numbers.add(b);

            double result = 0;
            switch (choice) {
                case 1:
                    result = controller.add(numbers);
                    break;
                case 2:
                    result = controller.subtract(numbers);
                    break;
                case 3:
                    result = controller.divide(numbers);
                    break;
                case 4:
                    result = controller.modulus(numbers);
                    break;
                case 5:
                    result = controller.getPercent(numbers);
                    break;
                case 6:
                    result = controller.percentageOf(numbers);
                    break;
                case 7:
                    result = controller.multiply(numbers);
                    break;
            }

            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}